package com.hillel.hw10.taxipark;

import com.hillel.hw10.exception.SearchCarForSpeedException;
import com.hillel.hw10.car.Car;


public interface TaxiPark {
    int coastOfTaxiPark();

    Car[] searchCarsForSpeed(int minSpeed, int maxSpeed) throws SearchCarForSpeedException;

    Car[] fuelConsumption();
}