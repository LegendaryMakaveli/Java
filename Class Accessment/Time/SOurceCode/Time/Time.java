package Time;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        validator(hour, minute, seconds);
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Time(){
        this(0);
    }
    public Time(int hour) {
        this(hour, 0);
    }
    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    private void validator(int hour, int minute, int seconds) {
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(seconds);
    }

    private void validateHour(int hour) {
        boolean isValidHour = hour < 0 || hour > 23;
        if(isValidHour) throw new IllegalArgumentException("Hour must be between 0 and 23");
    }

    private void validateMinute(int minute) {
        boolean isValidMinute = minute < 0 || minute > 59;
        if(isValidMinute) throw new IllegalArgumentException("Minute must be between 0 and 59");
    }

    private void validateSeconds(int seconds) {
        boolean isValidSeconds = seconds < 0 || seconds > 59;
        if(isValidSeconds) throw new IllegalArgumentException("Seconds must be between 0 and 59");
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
