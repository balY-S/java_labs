package ru.mirea.lab10;

public class Processor {
    private int clockSpeed;

    @Override
    public String toString() {
        return "clockSpeed - " + clockSpeed;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public Processor(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
}