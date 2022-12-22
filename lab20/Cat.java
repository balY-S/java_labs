package ru.mirea.labs;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    public Cat(String name) {
        super(name);
    }
}
