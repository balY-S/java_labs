package ru.mirea.lab41.p10;

public class Plane extends Vehicle {

    public Plane(double avrSpeed, double pricePassanger, double priceCargo) {
        super(avrSpeed, pricePassanger, priceCargo);
    }

    @Override
    public double getCostOfTransferOfPassengers(double dist) {
        return dist * (pricePassanger / 7);
    }

    @Override
    public double getCostOfTransportingCargo(double dist, double weight) {
        return (dist * priceCargo * (weight / 101)) / 10;
    }

    @Override
    public String toString() {
        return "Plane:";
    }
}
