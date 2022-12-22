package ru.mirea.labs;

import java.util.Scanner;

public class task08 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        try {
            printDetails( key );
        } catch (Exception e) {
            System.out.println("try again");
            String key1 = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception e1) {
                System.out.println("no");
            }
        }

    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );

    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception {
        task08 t = new task08();
        t.getKey();
    }
}

