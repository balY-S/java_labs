package ru.mirea.lab3;

public class AnyTypeArr<E> {
    private E[] arr;

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getLen() {
        return arr.length;
    }

    public E getElemByIndex(int i) {
        return arr[i];
    }

}