package ru.mirea.lab;

import java.util.HashSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2;
        hashSet.add(3);

        System.out.println("Hashset:");
        for (int n : hashSet) {
            System.out.print(n + " ");
        }

        System.out.println("\nTreeSet:");
        TreeSet<Integer> treeSet = convert(hashSet);
        for (var n : treeSet) {
            System.out.print(n + " ");
        }
    }

    public static <T> TreeSet<T> convert(HashSet<T> hashSet) {
        return new TreeSet<>(hashSet);
    }
}
