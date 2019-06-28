package com.hillel.hw10.storage;

import com.hillel.hw10.car.Car;

public interface CarsStorage {
    Car[] readCars();

    void writeCars(Car[] cars);
}
