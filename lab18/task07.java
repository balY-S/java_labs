package ru.mirea.labs;

import java.util.Scanner;

public class task07 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        printDetails( key );
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
        task07 t = new task07();
        t.getKey();
    }
}

