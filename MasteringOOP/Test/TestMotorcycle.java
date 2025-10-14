import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMotorcycle {
        @Test
        void validMotorcycle() {
            Motorcycle m = new Motorcycle("Yamaha", "R6", 2023);
            m.setDoors(0);
            m.setWheels(2);
            m.setSeat(2);
            m.setColor("Black");
            assertEquals("MOTORCYCLE: Engine started", m.startEngine());
            assertEquals(0, m.getDoors());
            assertEquals(2, m.getWheels());
            assertEquals(2, m.getSeat());
        }

        @Test
        void invalidDoors_nonZero_shouldThrow() {
            Motorcycle m = new Motorcycle("Honda", "CBR", 2021);
            assertThrows(IllegalArgumentException.class, () -> m.setDoors(1));
            assertThrows(IllegalArgumentException.class, () -> m.setDoors(-1));
        }

        @Test
        void invalidWheels_shouldThrow() {
            Motorcycle m = new Motorcycle("Suzuki", "GSX", 2022);
            assertThrows(IllegalArgumentException.class, () -> m.setWheels(3));
            assertThrows(IllegalArgumentException.class, () -> m.setWheels(1));
            assertThrows(IllegalArgumentException.class, () -> m.setWheels(-2));
            assertThrows(IllegalArgumentException.class, () -> m.setWheels(0));
        }

        @Test
        void invalidSeats_shouldThrow() {
            Motorcycle m = new Motorcycle("Kawasaki", "Ninja", 2020);
            assertThrows(IllegalArgumentException.class, () -> m.setSeat(1));
            assertThrows(IllegalArgumentException.class, () -> m.setSeat(3));
            assertThrows(IllegalArgumentException.class, () -> m.setSeat(-1));
            assertThrows(IllegalArgumentException.class, () -> m.setSeat(0));
        }

        @Test
        void toString_shouldContainKeyInfo() {
            Motorcycle m = new Motorcycle("Yamaha", "R1", 2022);
            m.setDoors(0);
            m.setWheels(2);
            m.setSeat(2);
            m.setColor("black");
            String s = m.toString();
            assertTrue(s.contains("Yamaha"));
            assertTrue(s.contains("R1"));
            assertTrue(s.contains("2022"));
            assertTrue(s.contains("2"));
        }

        @Test
        void extremeValues_shouldThrow() {
            Motorcycle m = new Motorcycle("Ducati", "Panigale", 2024);
            assertThrows(IllegalArgumentException.class, () -> m.setWheels(100));
            assertThrows(IllegalArgumentException.class, () -> m.setSeat(100));
            assertThrows(IllegalArgumentException.class, () -> m.setDoors(5));
        }

        @Test
        void checkStartEngineCaseSensitivity() {
            Motorcycle m = new Motorcycle("BMW", "M1000RR", 2025);
            assertNotEquals("motorcycle: engine started", m.startEngine());
        }
}
