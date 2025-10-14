public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }
    @Override
    public String startEngine() {
        return "MOTORCYCLE: Engine started";
    }

    @Override
    public void setDoors(int doors){
        if(doors != 0) throw new IllegalArgumentException("Motorcycle cannot have doors");
        this.doors = doors;
    }
    @Override
    public void setWheels(int wheels){
        if(wheels < 0) throw new IllegalArgumentException("Invalid wheels");
        if(wheels > 2) throw new IllegalArgumentException("Motorcycle cannot have more than 2 wheels");
        if(wheels != 2) throw new IllegalArgumentException("Motorcycle must have 2 wheels");
        this.wheels = wheels;
    }
    @Override
    public void setSeat(int seat){
        if(seat < 0) throw new IllegalArgumentException("Invalid seat");
        if(seat > 2) throw new IllegalArgumentException("Motorcycle cannot have more than 2 seats");
        if(seat != 2) throw new IllegalArgumentException("Invalid seat");
        this.seat = seat;
    }
    @Override
    public String toString() {
        return "Motorcycle [brand=" + getBrand() + ", model=" + getModel() + ", year=" + getYear() + ", doors=" + doors
                + ", wheels=" + wheels + ", color=" + color + ", seat=" + seat + "]";
    }
}
