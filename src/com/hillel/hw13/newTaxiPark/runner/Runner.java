package com.hillel.hw13.newTaxiPark.runner;

import com.hillel.hw13.newTaxiPark.car.Car;
import com.hillel.hw13.newTaxiPark.storage.CarsStorage;
import com.hillel.hw13.newTaxiPark.storage.impl.FileCarsStorage;
import com.hillel.hw13.newTaxiPark.taxipark.TaxiPark;
import com.hillel.hw13.newTaxiPark.taxipark.impl.TaxiParkImpl;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CarsStorage storage = new FileCarsStorage("input.txt", "output.txt");

        List<Car> cars = storage.readCars();

        TaxiPark park = new TaxiParkImpl(cars);

        System.out.println(park.coastOfTaxiPark());
        System.out.println(park.searchCarsForSpeed(0, 200));
        System.out.println(park.sortByFuelConsumption(Comparator.comparingInt(Car::getFuelConsumption)));

        storage.writeCars(cars);


    }
}
