package ru.mirea.labs;

public class task01 {

    public static void exceptionDemo1() {
        System.out.println( 2.0 / 0.0 );
    }

    public static void exceptionDemo2() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }

    }

    public static void main(String[] args) {
        exceptionDemo1();
        exceptionDemo2();
    }
}
