package ru.mirea.labs;

public class task05 {
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        task05 t = new task05();
        t.printMessage(null);
    }
}
