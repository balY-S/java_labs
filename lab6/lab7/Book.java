package ru.mirea.lab7;

import ru.mirea.lab6.Printable;

public class Book implements Printable {
    private String name;
    private String author;

    public  Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Book {name=" + name + ", author=" + author + "}");
    }
}
