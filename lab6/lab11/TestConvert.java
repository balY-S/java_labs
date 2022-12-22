package ru.mirea.lab11;

public class TestConvert {
    public static void main(String[] args)
    {
        Convert obj = new Convert();
        int n = 70;
        System.out.println("n = " + n);
        System.out.println("По Кельвину - " + obj.convertK(n));
        System.out.println("По Фаренгейту - " + obj.convertF(n));
    }
}