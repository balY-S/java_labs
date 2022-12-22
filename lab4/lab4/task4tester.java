package ru.mirea.lab4;

import java.util.Scanner;

public class task4tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Season favorite = Season.AUTUMN;

        favorite.displayFavoriteSeason();

        for (Season season : Season.values()) {
            System.out.print(season + " - ");
            season.getDescription();
            System.out.println(" Средняя температура: " + season.getAvrTemp());
        }
    }
}