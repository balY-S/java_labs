package task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b);
        b.setXY(3.3, 5.2);
        System.out.println(b);
        b.move(9, 6);
        System.out.println(b);
    }
}
