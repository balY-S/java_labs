package ru.mirea.labs;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        System.out.println("Input your string: ");
        var sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] splitted = str.split("[-+*,/=.]");
        for (String s :
                splitted) {
            System.out.println(s);
        }
    }
}
