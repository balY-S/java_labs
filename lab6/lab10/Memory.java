package ru.mirea.lab10;

public class Memory {
    private int size;

    @Override
    public String toString() {
        return "size - " + size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Memory(int size) {
        this.size = size;
    }
}
