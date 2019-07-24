package com.hillel.hw13.newTaxiPark.model;

import com.hillel.hw13.newTaxiPark.car.impl.CarImpl;

public class Truck extends CarImpl {
    private int loadCapacity;

    public Truck(int price, int fuelConsumption, int maxSpeed, int loadCapacity) {
        super(price, fuelConsumption, maxSpeed);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String[] carProperties) {
        this(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Trucks = " + ", " + " Price = " + getPrice() + ", " + " Fuel Consumption = " + getFuelConsumption() + ", " +
                " Max Speed = " + getMaxSpeed() + ", " +
                " LoadCapacity = " + loadCapacity + ";" + "\n";

    }

    public String toFileFormat() {
        return "Truck," + getPrice() + "," + getFuelConsumption() + "," + getMaxSpeed() + "," + getLoadCapacity();
    }
}
