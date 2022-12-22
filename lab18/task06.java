package ru.mirea.labs;

public class task06 {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (NullPointerException e) {
            System.out.println("null key in getDetails");
        }

    }
    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        task06 t = new task06();
        t.printMessage(null);
    }
}



//�������� ���������� ������ � ������� try/catch
