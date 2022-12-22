package ru.mirea.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите длину массива:");

        int size = input.nextInt();
        int [] array = new int[size];
        int i = 0;

        System.out.println("Введите " + size + " чисел:");

        while (i < size) {
            array[i] = input.nextInt();
            i++;
        }

        Arrays.sort(array);

        System.out.println("Минимальное значение: " + array[0]);
        System.out.println("Максимальное значение: " + array[array.length -1]);
    }
}
