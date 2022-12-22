package ru.mirea.lab41.p10;

public class Car extends Vehicle {

    public Car(double avrSpeed, double pricePassanger, double priceCargo) {
        super(avrSpeed, pricePassanger, priceCargo);
    }

    @Override
    public double getCostOfTransferOfPassengers(double dist) {
        return (dist * pricePassanger / 10);
    }

    @Override
    public double getCostOfTransportingCargo(double dist, double weight) {
        return (dist * priceCargo * (weight / 500 + 1)) / 10;
    }

    @Override
    public String toString() {
        return "Car:";
    }
}
