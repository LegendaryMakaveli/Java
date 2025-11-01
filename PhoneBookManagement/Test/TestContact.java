import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestContact {

    private Contact contact;

    @BeforeEach
    public void setup(){
        contact = new Contact("Jack", "Daniel", "07013020107");
    }

    @Test
    public void TestThatCreateANewContact(){
        String firstName = "Jack";
        String lastName = "Daniel";
        String phoneNumber = "07013020107";

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhoneNumber(phoneNumber);

        assertEquals("Jack", contact.getFirstName());
        assertEquals("Daniel", contact.getLastName());
        assertEquals("07013020107", contact.getPhoneNumber());
        assertEquals("Jack Daniel", contact.getFullName());
    }

    @Test
    public void testThatCreatingContactWithEmptyNameThrowException(){
        assertThrows(EmptyNameException.class, () -> contact.setFirstName(" "));
        assertThrows(EmptyNameException.class, () -> contact.setLastName(" "));

    }

    @Test
    public void testSetPhoneNumberWithValidNumber() {
        String validNumber = "08031234567";
        contact.setPhoneNumber(validNumber);
        assertEquals(validNumber, contact.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumberWithInternationalFormat() {
        String validIntl = "+2348031234567";
        contact.setPhoneNumber(validIntl);
        assertEquals(validIntl, contact.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumberWithInvalidNumberThrowsException() {
        String invalidNumber = "12345";
        assertThrows(InvalidPhoneNumberException.class, () -> contact.setPhoneNumber(invalidNumber));
    }

    @Test
    public void testSetPhoneNumberWithEmptyStringThrowsException() {
        String invalidNumber = "";
        assertThrows(InvalidPhoneNumberException.class, () -> contact.setPhoneNumber(invalidNumber));
    }

    @Test
    public void testSetPhoneNumberWithNullThrowsException() {
        assertThrows(InvalidPhoneNumberException.class, () -> contact.setPhoneNumber(null));
    }
}
