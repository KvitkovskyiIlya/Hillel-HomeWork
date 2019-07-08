package com.hillel.hw10.runner;

import com.hillel.hw10.storage.CarsStorage;
import com.hillel.hw10.storage.impl.FileCarsStorage;
import com.hillel.hw10.car.Car;


public class Runner {
    public static void main(String[] args) {
        CarsStorage storage = new FileCarsStorage("input.txt", "output.txt");

        Car[] cars = storage.readCars();

        storage.writeCars(cars);

    }
}
