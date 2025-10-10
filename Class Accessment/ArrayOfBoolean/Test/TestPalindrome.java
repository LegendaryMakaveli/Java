import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPalindrome {

    @Test
    public void TestIsPalindrome() {
        Palindrome checkPalindrome = new Palindrome();
        String[] words = {"racecar", "hello", "cohort", "madam"};

        boolean[] result = checkPalindrome.isPalindrome(words);

        boolean[] expected = {true, false, false, true};

        assertArrayEquals(expected, result);
    }
}
