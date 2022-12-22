package ru.mirea.lab41.p10;

public class Train extends Vehicle{

    public Train(double avrSpeed, double pricePassanger, double priceCargo) {
        super(avrSpeed, pricePassanger, priceCargo);
    }

    @Override
    public double getCostOfTransferOfPassengers(double dist) {
        return dist * (pricePassanger / 12);
    }

    @Override
    public double getCostOfTransportingCargo(double dist, double weight) {
        return (dist * priceCargo * (weight / 11000)) / 10;
    }

    @Override
    public String toString() {
        return "Train:";
    }
}
