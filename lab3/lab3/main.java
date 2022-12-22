package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main (String args[]) {
        int[] array = {};
        Random rand = new Random();

        array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10, 99);
        }
        System.out.println("Array: " + Arrays.toString(array));

        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i]<=array[i-1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
