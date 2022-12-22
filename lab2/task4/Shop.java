package task4;
import java.util.*;
import java.util.Scanner;


public class Shop {
    String name;
    double price;
    int id;
    public Shop (String name, double price, int id) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", name: " + name + ", price: " + price;
    }


    public static void main(String[] args) {
        ArrayList<Shop> products = new ArrayList<>();
        products.add(new Shop("Компьютер №1", 10000, 1));
        products.add(new Shop("Компьютер №2", 5000, 2));
        products.add(new Shop("Компьютер №3", 7500, 3));
        products.add(new Shop("Компьютер №4", 17000, 4));
        products.add(new Shop("Компьютер №5", 80000, 5));

        for(int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ID элемента, который хотите удалить: ");
        int deleteID = in.nextInt();

        for (Shop product: products) {
            if (product.id == deleteID) {
                products.remove(product);
            }
        }

        for(int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }

        System.out.println("Введите ID элемента, который хотите найти: ");
        int searchID = in.nextInt();

        for (Shop product: products) {
            if (product.id == searchID) {
                System.out.println(product.toString());
            }
        }
    }

}
