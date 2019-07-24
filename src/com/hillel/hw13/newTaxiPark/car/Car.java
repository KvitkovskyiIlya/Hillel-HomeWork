package com.hillel.hw13.newTaxiPark.car;

public interface Car {


    int getPrice();

    void setPrice(int price);

    int getFuelConsumption();

    void setFuelConsumption(int fuelConsumption);

    int getMaxSpeed();

    void setMaxSpeed(int maxSpeed);

    default String toFileFormat() {
        return "";
    }
}
