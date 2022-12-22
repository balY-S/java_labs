package ru.mirea.lab41.p10;

import java.text.NumberFormat;
import java.util.Locale;

public class Tester {
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[4];
        arr[0]=new Car(70,2,0.5);
        arr[1]=new Plane(500, 3,2);
        arr[2]=new Train(140,5,1);
        arr[3]=new Ship(50,6,2);

        double d = 1000.0, w = 70.0;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        for (Vehicle obj : arr) {
            System.out.print(obj);
            System.out.printf("\nВремя: %.2f часов\nСтоимость грузоперевозки: %s\nСтоимость перевозки пассажира: %s\n\n", obj.getTime(d),nf.format(obj.getCostOfTransportingCargo(d,w)) ,nf.format(obj.getCostOfTransferOfPassengers(d)));
        }
    }
}