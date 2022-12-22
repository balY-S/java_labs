package ru.mirea.labs;


public class task02 {
    public static void main(String[] args) {
        String str = new String("abcdefghijklmnopqrstuv18340");
        System.out.println(str.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(str.matches("abcdefghijklmnoasdfasdpqrstuv18340"));
    }
}