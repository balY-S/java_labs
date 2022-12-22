package ru.mirea.lab1;

import java.util.Date;


public class main {
    public static void main(String[] args) {
        System.out.println("Фамилия разработчика: Клочан");

        Date beginTask = new Date();
        beginTask.getDate();
        System.out.println("Дата и время получения задания: " + beginTask);

        Date finishTask = new Date();
        Long time = finishTask.getTime();
        long anotherDate = 3;
        time = time + (60 * 60 * 24 * 1000 * anotherDate);
        finishTask = new Date(time);
        System.out.println("Дата и время сдачи задания : " + finishTask);
    }
}
