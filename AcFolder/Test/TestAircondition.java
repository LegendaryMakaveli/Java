import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAircondition {

    @Test
    public void TestThatCreateNewAC() {
        AirCondition airCondition = new AirCondition();
        airCondition.setIsOn();
        airCondition.setName("MakAirCondition");
        airCondition.setTemperature(30);

        assertTrue(airCondition.getIsOn());
        assertEquals("MakAirCondition", airCondition.getName());
        assertEquals(30, airCondition.getTemperature());

    }
    @Test
    public void TestTheTemperatureIncreaseInAC() {
        AirCondition airCondition = new AirCondition();
        airCondition.setIsOn();
        airCondition.setName("MakAirCondition");
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();

        assertTrue(airCondition.getIsOn());
        assertEquals("MakAirCondition", airCondition.getName());
        assertEquals(19, airCondition.getTemperature());
    }

    @Test
    public void TestTheTemperatureDecreaseInAC() {
        AirCondition airCondition = new AirCondition();
        airCondition.setIsOn();
        airCondition.setName("MakAirCondition");
        airCondition.decreaseTemperature();
        airCondition.decreaseTemperature();

        assertTrue(airCondition.getIsOn());
        assertEquals("MakAirCondition", airCondition.getName());
        assertEquals(16, airCondition.getTemperature());
    }
}