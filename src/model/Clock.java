package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    NumberFormat formatter = new DecimalFormat("00");
    /**
     * Constructors
     */
    public Clock ()
    {


        hour = 0;
        minutes = 0;
        seconds = 0;


    }

    public Clock(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    /**
     *getters and setters
     */
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }


    public String setTime()
    {



        setHour((int)(Math.random()*(23-1)+0));
        setMinutes((int)(Math.random()*(59-1)+0));
        setSeconds((int)(Math.random()*(59-1)+0));

        String h = formatter.format(hour);
        String m = formatter.format(minutes);
        String s = formatter.format(seconds);
        return formatter.format(hour) + " : " + formatter.format(minutes)+ " : " + formatter.format(seconds);

    }

    public String aSecondFurther()
    {
        return  formatter.format(hour) + " : " + formatter.format(minutes)+ " : " + formatter.format(seconds+1);
    }
    public String aSecondAgo()
    {
        return  formatter.format(hour) + " : " + formatter.format(minutes)+ " : " + formatter.format(seconds-1);
    }

}

