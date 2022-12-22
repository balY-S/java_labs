package ru.mirea.lab2;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class main {
    public static void main(String[] args) throws ParseException{
        Scanner input = new Scanner(System.in);
        System.out.print("Введите время (dd.MM.YYYY): ");
        String date1 = input.nextLine();
        String date2 = "14.12.2022";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date dateOne = format.parse(date1);
        Date dateTwo = format.parse(date2);

        long difference = dateOne.getTime() - dateTwo.getTime();
        int days =  (int)(difference / (24 * 60 * 60 * 1000));
        System.out.println(days + " дн.");
    }
}
