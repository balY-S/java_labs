package ru.mirea.lab41.p8;

public class Circle extends Shape{
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        super();
        this.r = r;
    }

    public Circle(String color, boolean filled, double r) {
        super(color, filled);
        this.r = r;
    }
    @Override
    double getArea() {
        return Math.PI*r*r;
    }

    @Override
    double getPerimetr() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
