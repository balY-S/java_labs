package ru.mirea.labObertka1;

public class main {
    public static void main(String[] args)
    {
        double a = 46.5;
        String b = "85";

        // #1
        Double x = Double.valueOf(a);
        System.out.println("valueOf(a) = " + x);

        x = Double.valueOf(b);
        System.out.println("ValueOf(b) = " + x);

        // #2
        double q = Double.parseDouble(b);
        System.out.println("parseDouble(b) = " + q);

        // #3 #4
        Double obj = new Double("39.45");
        int intVal = obj.intValue();
        System.out.println(intVal);

        byte byteVal = obj.byteValue();
        System.out.println(byteVal);

        short shortVal = obj.shortValue();
        System.out.println(shortVal);

        float floatVal = obj.floatValue();
        System.out.println(floatVal);

        double doubleVal = obj.doubleValue();
        System.out.println(doubleVal);

        // #5
        double qwe = 43.4;
        String qwe2 = Double.toString(qwe);
        System.out.println(qwe2);
    }
}
