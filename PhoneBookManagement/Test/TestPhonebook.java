import org.junit.jupiter.api.*;
import java.io.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestPhonebook {

    private PhoneBook phoneBook;
    private final String FILE_NAME = "PhoneBookContacts.txt";

    @BeforeEach
    public void setUp() throws IOException {
        phoneBook = new PhoneBook();
        File file = new File(FILE_NAME);
        if (file.exists()) {
            new FileWriter(file, false).close();
        }
    }

    @Test
    public void testAddContactAddsToListAndFile() throws IOException {
        phoneBook.addContact("John", "Doe", "08123456789");

        List<Contact> contacts = phoneBook.getContactList();
        assertEquals(1, contacts.size());
        assertEquals("John", contacts.get(0).getFirstName());
        assertEquals("Doe", contacts.get(0).getLastName());
        assertEquals("08123456789", contacts.get(0).getPhoneNumber());

        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line = reader.readLine();
        reader.close();
        assertNotNull(line);
        assertTrue(line.contains("John"));
        assertTrue(line.contains("Doe"));
        assertTrue(line.contains("08123456789"));
    }

    @Test
    public void testFindContactByFullNameReturnsCorrectPhoneNumber() {
        phoneBook.addContact("Jane", "Doe", "08011223344");
        String phone = phoneBook.findContactByFullName("Jane Doe");
        assertEquals("08011223344", phone);
    }

    @Test
    public void testFindProfileByPhoneNumberReturnsCorrectFullName() {
        phoneBook.addContact("Emma", "Stone", "09122334455");
        String fullName = phoneBook.findProfileByPhoneNumber("09122334455");
        assertEquals("Emma Stone", fullName);
    }

    @Test
    public void testDeleteContactRemovesFromFileAndList() {
        phoneBook.addContact("David", "King", "09077889900");
        assertEquals(1, phoneBook.getContactList().size());

        phoneBook.deleteContact("David King");
        List<Contact> contacts = phoneBook.getContactList();

        assertTrue(contacts.isEmpty());
    }

    @Test
    public void testAddContactWithEmptyNameThrowsException() {
        assertThrows(EmptyNameException.class,
                () -> phoneBook.addContact("", "Doe", "08123456789"));
        assertThrows(EmptyNameException.class,
                () -> phoneBook.addContact("John", " ", "08123456789"));
    }

    @Test
    public void testAddContactWithEmptyPhoneThrowsException() {
        assertThrows(InvalidPhoneNumberException.class,
                () -> phoneBook.addContact("John", "Doe", ""));
    }

    @Test
    public void testFindContactThrowsWhenNotFound() {
        assertThrows(NotFoundException.class,
                () -> phoneBook.findContactByFullName("Ghost User"));
    }

    @Test
    public void testFindProfileThrowsWhenPhoneNotFound() {
        assertThrows(NotFoundException.class,
                () -> phoneBook.findProfileByPhoneNumber("00000000000"));
    }
}
