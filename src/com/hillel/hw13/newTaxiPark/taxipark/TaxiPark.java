package com.hillel.hw13.newTaxiPark.taxipark;

import com.hillel.hw13.newTaxiPark.exception.SearchCarForSpeedException;
import com.hillel.hw13.newTaxiPark.car.Car;

import java.util.List;

public interface TaxiPark {
    int getcoastOfTaxiPark();

    List<Car> getsearchCarsForSpeed(int minSpeed, int maxSpeed) throws SearchCarForSpeedException;

    List<Car> getfuelConsumption();
}
