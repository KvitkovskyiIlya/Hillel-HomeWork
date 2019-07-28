package com.hillel.hw13.newTaxiPark.taxipark;

import com.hillel.hw13.newTaxiPark.exception.SearchCarForSpeedException;
import com.hillel.hw13.newTaxiPark.car.Car;

import java.util.Comparator;
import java.util.List;

public interface TaxiPark {
    int coastOfTaxiPark();

    List<Car> searchCarsForSpeed(int minSpeed, int maxSpeed);

    List<Car> sortByFuelConsumption(Comparator<? super Car> comparator);

}
