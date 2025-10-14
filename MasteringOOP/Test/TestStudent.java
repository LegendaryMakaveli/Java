import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {

    @Test
    public void testValidStudentCreation() {
        Student student = new Student("Alice", 20, "A1B2C3D4E5", "Mathematics");
        assertEquals("A1B2C3D4E5", student.getStudentID());
        assertEquals("Mathematics", student.getCourse());
    }

    @Test
    public void testInvalidStudentIDTooShort() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Student("Bob", 22, "12345", "Biology");
        });
        assertTrue(exception.getMessage().contains("Student ID must be between 10 and 12"));
    }

    @Test
    public void testInvalidCourse() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Student("Eve", 21, "ABCDEFG1234", "Physics");
        });
        assertTrue(exception.getMessage().contains("Invalid course"));
    }

    @Test
    public void testRegisterValidStudent() {
        String message = Student.registerStudent("John", 20, "ABC1234567", "History");
        assertEquals("Student registered successfully", message);
    }

    @Test
    public void testRegisterStudentUnderage() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Student.registerStudent("Jane", 17, "1234567890", "Computer Science");
        });
        assertTrue(exception.getMessage().contains("at least 18 years old"));
    }

    @Test
    public void testRegisterStudentInvalidCourse() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Student.registerStudent("Mary", 22, "ABCDEFGHIJ", "Music");
        });
        assertTrue(exception.getMessage().contains("Invalid course"));
    }
}
