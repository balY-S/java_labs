package ru.mirea.lab1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число от которого хотите получить факториал:");
        int factorial = input.nextInt();
        int result = 1;

        for (int i =1; i <= factorial; i++){
            result *= i;
        }

        System.out.println(factorial + "!" + " = " + result);
    }
}
