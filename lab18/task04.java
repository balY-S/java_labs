package ru.mirea.labs;

import java.util.Scanner;

public class task04 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e) {
            System.out.println("Enter a NUMBER");
        } finally {
            System.out.println("finally block has been processed");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
