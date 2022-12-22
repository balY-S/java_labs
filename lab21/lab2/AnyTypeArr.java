package ru.mirea.lab2;

public class AnyTypeArr <E> {
    private E[] arr;

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getLen() {
        return arr.length;
    }
}
