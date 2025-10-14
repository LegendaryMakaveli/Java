import java.util.*;
import static java.util.Arrays.asList;

public class Student extends Person {
    private String studentID;
    private String course;

    private static final List<Student> students = new ArrayList<>();
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random random = new Random();

    public Student(String name, int age, String studentID, String course) {
        super(name, age);
        setStudentID(studentID);
        setCourse(course);
    }

    public void setStudentID(String studentID) {
        if (studentID == null || studentID.trim().isEmpty())
            throw new IllegalArgumentException("Student ID cannot be empty");

        if (studentID.length() < 10 || studentID.length() > 12)
            throw new IllegalArgumentException("Student ID must be between 10 and 12 characters long");

        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setCourse(String course) {
        if (course == null || course.trim().isEmpty())
            throw new IllegalArgumentException("Course cannot be empty");

        boolean found = false;
        for (String availableCourse : getAvailableCourses()) {
            if (availableCourse.equalsIgnoreCase(course)) {
                this.course = availableCourse; // use standard case
                found = true;
                break;
            }
        }

        if (!found)
            throw new IllegalArgumentException("Invalid course: " + course);
    }

    public String getCourse() {
        return course;
    }

    public static String registerStudent(String name, int age, String studentID, String course) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");

        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");

        if (age < 18)
            throw new IllegalArgumentException("Student must be at least 18 years old");

        if (studentID == null || studentID.trim().isEmpty())
            throw new IllegalArgumentException("Student ID cannot be empty");

        if (course == null || course.trim().isEmpty())
            throw new IllegalArgumentException("Course cannot be empty");

        boolean found = false;
        for (String availableCourse : getAvailableCourses()) {
            if (availableCourse.equalsIgnoreCase(course)) {
                students.add(new Student(name, age, studentID, course));
                found = true;
                break;
            }
        }

        if (!found)
            throw new IllegalArgumentException("Invalid course: " + course);

        return "Student registered successfully";
    }

    private static List<String> getAvailableCourses() {
        return new ArrayList<>(asList(
                "Mathematics",
                "Computer Science",
                "Biology",
                "History",
                "Art"
        ));
    }

    public static String generateId() {
        int length = 10 + random.nextInt(3);
        StringBuilder id = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            id.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }

        return id.toString();
    }

    public static List<String> showStudentsId() {
        List<String> ids = new ArrayList<>();
        for (Student student : students) {
            ids.add(student.getStudentID());
        }
        return ids;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, ID: %s, Course: %s",
                getName(), getAge(), studentID, course);
    }
}
