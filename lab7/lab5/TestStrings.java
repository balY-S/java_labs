package ru.mirea.lab5;

public class TestStrings {
    public static void main(String[] args) {
        Strings strings = new FuncStrings();
        String s = "Java best";
        System.out.println(strings.length(s));
        System.out.println(strings.oddPos(s));
        System.out.println(strings.invert(s));
    }
}