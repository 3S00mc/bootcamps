package br.com.bradesco.orientacaoaobjetos.inheritance.clocks;

public abstract class Clock {

    // Attributes
    protected int hour;
    protected int minute;
    protected int second;

    // Constructor

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Methods

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24) {
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60) {
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60) {
            this.second = 60;
            return;
        }
        this.second = second;
    }

    abstract Clock convert(Clock clock);
}
