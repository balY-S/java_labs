package task2;

public class Ball {
    double x = 0.0, y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() { }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }

    public void move(double xRasst, double yRasst){
        setX(x+xRasst);
        setY(y+yRasst);
    }

    @Override
    public String toString() {
        return "Ball: " + "x = " + x + ", y = " + y;
    }
}
