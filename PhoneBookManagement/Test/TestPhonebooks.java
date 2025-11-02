import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestPhonebooks {
    private Phonebooks phonebooks;

    @BeforeEach
    public void setUp() {
        phonebooks = new Phonebooks();
    }

    @Test
    public void testAddPhoneBookSuccessfullyAdds() {
        phonebooks.addPhoneBook("Mary");
        List<PhoneBook> phoneBooks = phonebooks.getPhoneBookList();

        assertEquals(1, phoneBooks.size());
        assertEquals("Mary", phoneBooks.get(0).getOwnerName());
    }

    @Test
    public void testAddPhoneBookThrowsExceptionIfNameAlreadyExists() {
        phonebooks.addPhoneBook("Mary");

        PhoneBookException exception = assertThrows(
                PhoneBookException.class,
                () -> phonebooks.addPhoneBook("Mary")
        );

        assertEquals("PhoneBook with name 'Mary' already exists!", exception.getMessage());
        assertEquals(1, phonebooks.getPhoneBookList().size());
    }

    @Test
    public void testAddPhoneBookThrowsExceptionIfNameIsEmpty() {
        assertThrows(PhoneBookException.class, () -> phonebooks.addPhoneBook(" "));
        assertThrows(PhoneBookException.class, () -> phonebooks.addPhoneBook(null));
    }

    @Test
    public void testFindPhoneBookByNameReturnsCorrectBook() {
        phonebooks.addPhoneBook("Mary");
        phonebooks.addPhoneBook("John");

        PhoneBook found = phonebooks.findPhoneBookByName("john");

        assertNotNull(found);
        assertEquals("John", found.getOwnerName());
    }

    @Test
    public void testFindPhoneBookByNameReturnsNullIfNotFound() {
        phonebooks.addPhoneBook("Mary");

        PhoneBook result = phonebooks.findPhoneBookByName("David");

        assertNull(result);
    }

    @Test
    public void testDeletePhoneBookRemovesIt() {
        phonebooks.addPhoneBook("Mary");
        phonebooks.addPhoneBook("John");

        phonebooks.deletePhoneBook("Mary");

        assertEquals(1, phonebooks.getPhoneBookList().size());
        assertEquals("John", phonebooks.getPhoneBookList().get(0).getOwnerName());
    }

    @Test
    public void testDeletePhoneBookThrowsExceptionIfNotFound() {
        phonebooks.addPhoneBook("Mary");

        NotFoundException exception = assertThrows(
                NotFoundException.class,
                () -> phonebooks.deletePhoneBook("John")
        );

        assertEquals("PhoneBook with name 'John' not found!", exception.getMessage());
        assertEquals(1, phonebooks.getPhoneBookList().size());
    }
}

