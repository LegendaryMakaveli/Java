package Time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTime {

    @Test
    public void TestThatCreateANewTimeObjectWorks() {
        Time time = new Time(4, 44, 45);
        time.setHour(8);
        time.setMinute(20);
        time.setSeconds(44);

        assertTrue(time.getHour() == 8 && time.getMinute() == 20 && time.getSeconds() == 44);
    }
}
