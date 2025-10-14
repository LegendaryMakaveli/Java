import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCar {

    @Test
    public void TestCarCreation(){
        String brand = "Lexus";
        String model = "RX";
        int year = 2025;

        Car myCar = new Car(brand, model, year);
        myCar.setBrand(brand);
        myCar.setModel(model);
        myCar.setYear(year);

        assertEquals(brand, myCar.getBrand());
        assertEquals(model, myCar.getModel());
        assertEquals(year, myCar.getYear());
    }

    @Test
    public void TestMethodThatDisplaysCarInfo(){
        String brand = "Lexus";
        String model = "RX";
        int year = 2025;

        Car myCar = new Car(brand, model, year);
        myCar.setBrand(brand);
        myCar.setModel(model);
        myCar.setYear(year);

        String expectedInfo = "CAR INFO: " + brand + " " + model + " " + year;
        String actualInfo = Car.displayCarInfo(myCar);

        assertEquals(expectedInfo, actualInfo);
    }

    @Test
    public void TestTwoCarCreation(){
        Car myCar = new Car("Lexus", "RX", 2025);
        Car mySecondCar = new Car("Toyota", "RAV4", 2024);

        String expectedInfoFirstCar = "CAR INFO: Lexus RX 2025";
        String actualInfoFirstCar = Car.displayCarInfo(myCar);
        assertEquals(expectedInfoFirstCar, actualInfoFirstCar);

        String expectedInfoSecondCar = "CAR INFO: Toyota RAV4 2024";
        String actualInfoSecondCar = Car.displayCarInfo(mySecondCar);
        assertEquals(expectedInfoSecondCar, actualInfoSecondCar);


    }
}
