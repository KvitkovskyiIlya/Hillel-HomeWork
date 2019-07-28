package com.hillel.hw13.newTaxiPark.taxipark.impl;

import HW6.Interfaces.CarInter;
import com.hillel.hw13.newTaxiPark.exception.SearchCarForSpeedException;
import com.hillel.hw13.newTaxiPark.car.Car;
import com.hillel.hw13.newTaxiPark.taxipark.TaxiPark;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiParkImpl implements TaxiPark {
    private List<Car> taxiPark;


    public TaxiParkImpl(List<Car> taxiPark) {
        this.taxiPark = taxiPark;
    }

    @Override
    public int coastOfTaxiPark() {
        return taxiPark.stream().reduce(0, (coast, car) -> coast += car.getPrice(), Integer::sum);
    }

    @Override
    public List<Car> searchCarsForSpeed(int minSpeed, int maxSpeed) {
        return taxiPark.stream().filter((Car car) -> (car.getMaxSpeed() <= maxSpeed && car.getMaxSpeed() >= minSpeed)).collect(Collectors.toList());
    }

    @Override
    public List<Car> sortByFuelConsumption(Comparator<? super Car> comparator) {
        return taxiPark.stream().sorted(comparator).collect(Collectors.toList());
    }

    public List<Car> getTaxiPark() {
        return taxiPark;
    }

    public void setTaxiPark(List<Car> taxiPark) {
        this.taxiPark = taxiPark;
    }
}
