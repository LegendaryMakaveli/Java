public class Vehicle extends Car{
    int doors;
    int wheels;
    String color;
    int seat;

    public Vehicle(String brand, String model, int year) {
        super(brand, model, year);
        Car myCar = new Car(brand, model, year);
        myCar.setBrand(brand);
        myCar.setModel(model);
        myCar.setYear(year);
    }
    public void setDoors(int doors){
        if(doors < 0) throw new IllegalArgumentException("Invalid doors");
        if(doors > 4) throw new IllegalArgumentException("Invalid doors");
        if(doors == 0) throw new IllegalArgumentException("Invalid doors");
        this.doors = doors;
    }

    public int getDoors(){
        return doors;
    }

    public void setWheels(int wheels){
        if(wheels < 0) throw new IllegalArgumentException("Invalid wheels");
        if(wheels > 4) throw new IllegalArgumentException("Invalid wheels");
        if(wheels == 0) throw new IllegalArgumentException("Invalid wheels");
        this.wheels = wheels;
    }

    public int getWheels(){
        return wheels;
    }

    public void setColor(String color){
        if(color.equals("")) throw new IllegalArgumentException("Color cannot be empty");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setSeat(int seat){
        if(seat < 0) throw new IllegalArgumentException("Invalid seat");
        if(seat > 5) throw new IllegalArgumentException("Invalid seat");
        if(seat == 0) throw new IllegalArgumentException("Invalid seat");
        this.seat = seat;
    }

    public int getSeat(){
        return seat;
    }

    @Override
    public String startEngine(){
       return "VEHICLE: Engine started";
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + getBrand() + ", model=" + getModel() + ", year=" + getYear() + ", doors=" + doors
                + ", wheels=" + wheels + ", color=" + color + ", seat=" + seat + "]";
    }
}