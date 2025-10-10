import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestNumberInRange {

    @Test
    void testMissingNumbersInRange() {
        int[] numbers = {1, 4, 7};
        int[] expected = {2, 3, 5, 6};
        assertArrayEquals(expected, NumberInRangeSmallestAndLargest.numberInRange(numbers));
    }

    @Test
    void testNoMissingNumbers() {
        int[] numbers = {3, 4, 5};
        int[] expected = {};
        assertArrayEquals(expected, NumberInRangeSmallestAndLargest.numberInRange(numbers));
    }

    @Test
    void testWithNegativeNumbers() {
        int[] numbers = {-2, 0, 1};
        int[] expected = {-1};
        assertArrayEquals(expected, NumberInRangeSmallestAndLargest.numberInRange(numbers));
    }

    @Test
    void testSingleNumber() {
        int[] numbers = {5};
        int[] expected = {};
        assertArrayEquals(expected, NumberInRangeSmallestAndLargest.numberInRange(numbers));
    }

    @Test
    void testUnorderedInput() {
        int[] numbers = {8, 2, 5};
        int[] expected = {3, 4, 6, 7};
        assertArrayEquals(expected, NumberInRangeSmallestAndLargest.numberInRange(numbers));
    }
}
