import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestVehicle {
        @Test
        public void testConstructorAndDefaults() {
            Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022);

            assertEquals(0, vehicle.getDoors(), "Default doors should be 0");
            assertEquals(0, vehicle.getWheels(), "Default wheels should be 0");
            assertEquals("VEHICLE: Engine started", vehicle.startEngine());
        }

        @Test
        public void testSettersAndGetters() {
            Vehicle vehicle = new Vehicle("Honda", "Accord", 2020);

            vehicle.setDoors(4);
            vehicle.setWheels(4);
            vehicle.setColor("Green");
            vehicle.setSeat(5);

            assertEquals(4, vehicle.getDoors());
            assertEquals(4, vehicle.getWheels());
            assertEquals("Green", vehicle.getColor());
            assertEquals(5, vehicle.getSeat());
        }

        @Test
        public void testInvalidDoors_negative_shouldThrow() {
            Vehicle vehicle = new Vehicle("Ford", "Fiesta", 2019);
            assertThrows(IllegalArgumentException.class, () -> vehicle.setDoors(-1),
                    "setDoors(-1) should throw IllegalArgumentException (invalid doors)");
        }

        @Test
        public void testInvalidWheels_zero_shouldThrow() {
            Vehicle vehicle = new Vehicle("Ford", "Fiesta", 2019);
            assertThrows(IllegalArgumentException.class, () -> vehicle.setWheels(0),
                    "setWheels(0) should throw IllegalArgumentException (invalid wheels)");
            assertThrows(IllegalArgumentException.class, () -> vehicle.setWheels(-2),
                    "setWheels(-2) should throw IllegalArgumentException (invalid wheels)");
        }

        @Test
        public void testInvalidSeat_zero_shouldThrow() {
            Vehicle v = new Vehicle("Ford", "Fiesta", 2019);
            assertThrows(IllegalArgumentException.class, () -> v.setSeat(0),
                    "setSeat(0) should throw IllegalArgumentException (invalid seat)");
            assertThrows(IllegalArgumentException.class, () -> v.setSeat(-3),
                    "setSeat(-3) should throw IllegalArgumentException (invalid seat)");
        }

        @Test
        public void testInvalidColor_negative_shouldThrow() {
            Vehicle vehicle = new Vehicle("Ford", "Fiesta", 2019);
            vehicle.setColor("Black");
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                vehicle.setColor("");
            });
            String expectedMessage = "Color cannot be empty";
            String actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
        }

        @Test
        public void testStartEngineExactString() {
            Vehicle v = new Vehicle("Mazda", "3", 2021);
            assertEquals("VEHICLE: Engine started", v.startEngine(), "startEngine() should return the override string");
        }

        @Test
        public void testLargeValuesShouldBeRejectedOrHandled() {
            Vehicle v = new Vehicle("Big", "Truck", 2025);
            assertThrows(IllegalArgumentException.class, () -> v.setDoors(1_000_000),
                    "Unrealistic door count should throw IllegalArgumentException");
            assertThrows(IllegalArgumentException.class, () -> v.setWheels(1_000_000),
                    "Unrealistic wheel count should throw IllegalArgumentException");
            assertThrows(IllegalArgumentException.class, () -> v.setSeat(1_000_000),
                    "Unrealistic seat count should throw IllegalArgumentException");
        }
}
