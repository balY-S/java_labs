package ru.mirea.labs;

import java.util.Scanner;

public class task03 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e) {
            System.out.println("Enter a NUMBER");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
