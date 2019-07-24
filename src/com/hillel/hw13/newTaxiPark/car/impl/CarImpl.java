package com.hillel.hw13.newTaxiPark.car.impl;

import com.hillel.hw13.newTaxiPark.car.Car;

abstract public class CarImpl implements Car {
    private int price;
    private int fuelConsumption;
    private int maxSpeed;


    public CarImpl(int price, int fuelConsumption, int maxSpeed) {

        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "CarInter{" +
                "price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String toFileFormat() {
        return "MilitaryVehicles, " + getPrice() + "" + getFuelConsumption() + "" + getMaxSpeed();
    }

}
