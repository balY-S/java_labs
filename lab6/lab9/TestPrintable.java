package ru.mirea.lab9;

import ru.mirea.lab6.Printable;
import ru.mirea.lab7.Book;
import ru.mirea.lab8.Shop;

import java.util.ArrayList;
import java.util.List;

public class TestPrintable {
    public static void main(String[] args) {
        List<Printable> list= new ArrayList<>();
        list.add(new Book("kniga", "da"));
        list.add(new Book("knigaaaa", "dada"));
        list.add(new Shop("zhurnal", 23500));
        list.add(new Shop("zhurnalll", 15020));

        for (var p : list) {
            p.print();
        }
    }
}
