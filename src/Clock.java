public class Clock {
    private int seconds;
    private int minutes;
    private int hours;

    public Clock(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public String printTime() {
        return ("The time is " + this.hours + " : " + this.minutes + " : " + this.seconds);
    }


}
