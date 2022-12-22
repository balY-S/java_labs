package ru.mirea.lab41.p10;

public abstract class Vehicle {
    protected double avrSpeed, pricePassanger, priceCargo;
    public Vehicle(double avrSpeed, double pricePassanger, double priceCargo) {
        this.avrSpeed = avrSpeed;
        this.pricePassanger = pricePassanger;
        this.priceCargo = priceCargo;
    }

    public double getTime(double dist) {
        return dist / avrSpeed;
    }

    public abstract double getCostOfTransferOfPassengers(double dist);
    public abstract double getCostOfTransportingCargo(double dist, double weight);

    @Override
    public String toString() {
        return "Vehicle:";
    }
}