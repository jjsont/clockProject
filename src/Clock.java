import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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
    public void timer() {
        int timeSeconds = 0;
        Scanner timeRemind = new Scanner(System.in);
        System.out.println("How much seconds should I remind you in?");
        timeSeconds = Integer.parseInt(timeRemind.nextLine());
        double currentTime = System.currentTimeMillis() * 0.001;
        while (currentTime != timeSeconds) {
            String a = "";
        }
        System.out.println("Your time is up");
    }

}
