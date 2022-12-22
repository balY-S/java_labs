package ru.mirea.lab1;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Point x = " + x + " Point y = " + y + '\n'
                + "x speed = " + xSpeed + " y speed = " + ySpeed + '\n'
                + "radius = " + radius;
    }
}
