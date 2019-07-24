package com.hillel.hw13.newTaxiPark.runner;

import com.hillel.hw13.newTaxiPark.car.Car;
import com.hillel.hw13.newTaxiPark.storage.CarsStorage;
import com.hillel.hw13.newTaxiPark.storage.impl.FileCarsStorage;
import com.hillel.hw13.newTaxiPark.taxipark.TaxiPark;
import com.hillel.hw13.newTaxiPark.taxipark.impl.TaxiParkImpl;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CarsStorage storage = new FileCarsStorage("input.txt", "output.txt");

        List<Car> cars = storage.readCars();

        TaxiPark park = new TaxiParkImpl(cars);

        System.out.print("Coast TaxiPark = ");
        System.out.println(park.getcoastOfTaxiPark());

       /* System.out.print("Search cars by speed = ");
        try {
            Car[] searchCarsBySpeed = park.getsearchCarsForSpeed(0, -1);
            for (int i = 0; i < searchCarsBySpeed.length; i++) {
                System.out.println(searchCarsBySpeed[i].toString());
            }
        } catch (SearchCarForSpeedException e) {
            System.out.println("Exception warning: " + e);
        }*/

        System.out.print("Cars fuel consumption = ");
        park.getfuelConsumption();
        System.out.println(park);
        storage.writeCars(cars);

    }
}
