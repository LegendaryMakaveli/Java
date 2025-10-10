import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculateOutPut {
    @Test
    public void TestThatTheMethodWorksAsExpected() {
        CalculateOutPut obj = new CalculateOutPut();
        int [] array = {3,5,2,7,10};
        obj.sumOfTwo(array);
        int [] result = new int[]{3,5};

        assertEquals(Arrays.toString(result), Arrays.toString(obj.sumOfTwo(array)));

    }
}
