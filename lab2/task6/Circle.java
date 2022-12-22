package task6;

public class Circle {
    protected double radius;
    protected boolean filled;

    public Circle(boolean filled, double radius) {
        this.filled = filled;
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean getFillInfo() {
        return filled;
    }

    public void setFillInfo(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle: radius - " + radius + ", filled - " + filled;
    }

    public String getSquare() {
        return "Square: " + (Math.PI * radius * radius);
    }

    public String getPerimeter() {
        return "Perimeter: " + Math.PI * radius * 2;
    }
}
