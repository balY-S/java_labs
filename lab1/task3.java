package ru.mirea.lab1;

public class task3 {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 7, 10, 8, 1 ,8, 2, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int sred = 0;
        sred = sum / array.length;

        System.out.println("Сумма чисел в массиве:");
        System.out.println(sum);
        System.out.println("Среднее арифметическиое:");
        System.out.println(sred);
    }
}
