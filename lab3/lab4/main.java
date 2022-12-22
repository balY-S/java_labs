package ru.mirea.lab4;
import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        int n = 0;

        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите размер массива: ");

            if (sc.hasNextInt()) {

                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Число игроков не может быть меньше или равно 0");
                    break;
                }
                else {
                    break;
                }

            }
            else {
                System.out.println("Вы ввели не число, или ваше число слишком большое!");
            }

        }

        Random rand = new Random();

        int[] array = {};
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, n);
        }

        System.out.println("Array №1: " + Arrays.toString(array));

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && !(arrayList.contains(array[i]))){
                arrayList.add(array[i]);
            }
        }
        System.out.println("Array №2: " + arrayList);

    }
}
