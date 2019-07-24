package com.hillel.hw13.newTaxiPark.storage;

import com.hillel.hw13.newTaxiPark.car.Car;

import java.util.List;

public interface CarsStorage {
    List<Car> readCars();

    void writeCars(List<Car> cars);
}
