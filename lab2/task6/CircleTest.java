package task6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(true, 10);
        System.out.println(c1);

        c1.setRadius(18.8);
        System.out.println(c1);

        c1.setFillInfo(false);
        System.out.println(c1);

        Circle c2 = new Circle(true, 15);
        System.out.println(c2);

        if (c1.getRadius() < c2.getRadius()){
         System.out.println("Radius second circle more first");
        }
        else {
            System.out.println("Radius first circle more second");
        }
    }
}
