package task7;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("asd", "qwe", 3333, 1950);
        System.out.println(b1);

        b1.setName("ASD");
        System.out.println(b1);


        System.out.println("Name: " + b1.getName());

        b1.setEdition(100);
        System.out.println(b1);

        System.out.println("Publish Year: " + b1.getPublishYear());
    }
}
