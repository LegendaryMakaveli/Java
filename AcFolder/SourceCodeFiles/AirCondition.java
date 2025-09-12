public class AirCondition {
    private boolean isOn = false;
    private int temperature = 17;
    private String name;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setTemperature(int newTemperature) {
        if(isOn && newTemperature > 16 && newTemperature < 31 ){
            temperature = newTemperature;
        }
    }
    public void increaseTemperature(){
        if(isOn && temperature >= 16 && temperature < 30){
            temperature++;
        }
    }
    public void decreaseTemperature(){
        if(isOn && temperature > 16 && temperature < 30 ){
            temperature--;
        }
    }

    public int getTemperature() {
        return temperature;
    }
    public void setIsOn() {
        isOn = true;
    }
    public boolean getIsOn() {
        return isOn;
    }
}