import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerson {
    @Test
    public void TestPersonCreation() {
        Person person = new Person("John", 30);
        person.setName("Janet");
        person.setAge(25);

        assertEquals("Janet", person.getName());
        assertEquals(25, person.getAge());
    }

    @Test
    public void TestPersonAgeValidation() {
        Person person = new Person("Alice", 20);

        try {
            person.setAge(-5);
        } catch (IllegalArgumentException error) {
            assertEquals("Age cannot be negative", error.getMessage());
        }

        try {
            person.setAge(130);
        } catch (IllegalArgumentException error) {
            assertEquals("Age cannot be greater than 120", error.getMessage());
        }

        try {
            person.setAge(15);
        } catch (IllegalArgumentException error) {
            assertEquals("Age must be at least 18", error.getMessage());
        }
    }
}
