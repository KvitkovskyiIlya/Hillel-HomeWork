package com.hillel.hw13.newTaxiPark.taxipark.impl;

import com.hillel.hw13.newTaxiPark.exception.SearchCarForSpeedException;
import com.hillel.hw13.newTaxiPark.car.Car;
import com.hillel.hw13.newTaxiPark.taxipark.TaxiPark;

import java.util.LinkedList;
import java.util.List;

public class TaxiParkImpl implements TaxiPark {
    private List<Car> taxiPark;


    public TaxiParkImpl(List<Car> taxiPark) {
        this.taxiPark = taxiPark;
    }

    public int getcoastOfTaxiPark() {
        int coast = 0;

        for (int i = 0; i < this.taxiPark.size(); i++) {
            coast += this.taxiPark.get(i).getPrice();
        }
        return coast;
    }

    public List<Car> getsearchCarsForSpeed(int minSpeed, int maxSpeed) throws SearchCarForSpeedException {
        if (minSpeed < 0 || maxSpeed < 0)
            throw new SearchCarForSpeedException(minSpeed, maxSpeed);

        List<Car> searchCar = new LinkedList<>();

        for (Car car : taxiPark) {
            if (car.getMaxSpeed() <= maxSpeed && car.getMaxSpeed() >= minSpeed) {
                searchCar.add(car);
            }
        }

        return searchCar;
    }

    public List<Car> getfuelConsumption() {

        for (int i = 0; i < taxiPark.size(); i++) {
            for (int j = i + 1; j < taxiPark.size(); j++) {
                if (taxiPark.get(j).getFuelConsumption() < taxiPark.get(i).getFuelConsumption()) {
                    Car temp = taxiPark.get(j);
                    taxiPark.set(j, taxiPark.get(i));
                    taxiPark.set(i, temp);
                }
            }
        }
        return taxiPark;
    }

    public List<Car> getTaxiPark() {
        return taxiPark;
    }

    public void setTaxiPark(List<Car> taxiPark) {
        this.taxiPark = taxiPark;
    }
}
