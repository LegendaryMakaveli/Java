import java.util.ArrayList;
import java.util.List;

public class NumberInRangeSmallestAndLargest {

    public static int[] numberInRange(int[] numbers) {
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int digit : numbers) {
            if (digit > largest) largest = digit;
            if (digit < smallest) smallest = digit;
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (int count = smallest; count <= largest; count++) {
            boolean existingNumbers = false;
            for (int number : numbers) {
                if (number == count) {
                    existingNumbers = true;
                    break;
                }
            }
            if (!existingNumbers) {
                missingNumbers.add(count);
            }
        }

        int[] result = new int[missingNumbers.size()];
        for (int count = 0; count < missingNumbers.size(); count++) {
            result[count] = missingNumbers.get(count);
        }

        return result;
    }
}