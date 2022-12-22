package ru.mirea.lab2;

import java.util.Arrays;

public class task2 {
    public static <E> void sid (E[] arr) {
        E[] a = arr;
        AnyTypeArr <E> sid = new AnyTypeArr<>();
        sid.setArr(a);

        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        String[] s = {"Hello", "asd"};
        sid(s);

        Integer[] i = {1,2,3,4};
        sid(i);

        Double[] d = {1.3, 351.551, 125123.14132};
        sid(d);
    }
}
