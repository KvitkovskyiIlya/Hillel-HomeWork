package com.hillel.hw10.taxipark.impl;

import com.hillel.hw10.exception.SearchCarForSpeedException;
import com.hillel.hw10.taxipark.TaxiPark;
import com.hillel.hw10.car.Car;

public class TaxiParkImpl implements TaxiPark {
    private Car[] taxiPark;


    public TaxiParkImpl(Car[] taxiPark) {
        this.taxiPark = taxiPark;
    }

    public int coastOfTaxiPark() {
        int coast = 0;

        for (int i = 0; i < this.taxiPark.length; i++) {
            coast += this.taxiPark[i].getPrice();
        }
        return coast;
    }


    public Car[] searchCarsForSpeed(int minSpeed, int maxSpeed) throws SearchCarForSpeedException {
        if (minSpeed < 0 || maxSpeed < 0)
            throw new SearchCarForSpeedException(minSpeed, maxSpeed);

        Car[] searchCar = null;

        for (Car car : taxiPark) {
            if (car.getMaxSpeed() <= maxSpeed && car.getMaxSpeed() >= minSpeed) {
                if (searchCar == null) {
                    searchCar = new Car[1];
                    searchCar[0] = car;
                } else {
                    Car[] tempCar = new Car[searchCar.length + 1];
                    for (int i = 0; i < searchCar.length; i++) {
                        tempCar[i] = searchCar[i];
                    }
                    tempCar[searchCar.length] = car;
                    searchCar = tempCar;
                }
            }
        }
        return searchCar;
    }

    public Car[] fuelConsumption() {

        for (int i = taxiPark.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (taxiPark[j].getFuelConsumption() > taxiPark[j + 1].getFuelConsumption()) {
                    Car temp = taxiPark[j];
                    taxiPark[j] = taxiPark[j + 1];
                    taxiPark[j + 1] = temp;
                }
            }
        }
        return taxiPark;
    }
}
