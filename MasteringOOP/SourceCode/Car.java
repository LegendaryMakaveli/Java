public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public String startEngine(){
       return "CAR: Engine started";
    }

    public static String displayCarInfo(Car newCar){
        return "CAR INFO: " + newCar.getBrand() + " " + newCar.getModel() + " " + newCar.getYear();
    }

}
