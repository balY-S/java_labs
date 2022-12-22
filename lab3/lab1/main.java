package ru.mirea.lab1;
import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main (String args[]) {
        double[] array = {};
        Random rand = new Random();

        array = new double[(rand.nextInt(1, 15))];

        for (int i =0; i < array.length; i++) {
            double number = rand.nextDouble(0.01,1);
            number = Math.round(number * 100);
            array[i] = number / 100;
        }
        Arrays.sort(array);
        System.out.println("Sorted array (Random): " + Arrays.toString(array));

        array = new double[(int) (Math.random() * 15)];

        for (int i =0; i < array.length; i++) {
            double number = Math.random();
            number = Math.round(number * 100);
            array[i] = number / 100;
        }
        Arrays.sort(array);
        System.out.println("Sorted array (Math.random): " + Arrays.toString(array));

    }
}
