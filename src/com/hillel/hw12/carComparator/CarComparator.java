package com.hillel.hw12.carComparator;

import HW6.Interfaces.CarInter;

public class CarComparator {
    public static  int compareToFuelConsumption(CarInter o1, CarInter o2) {

        if (o1.getFuelConsumption() > o2.getFuelConsumption()) {
            return 1;
        } else if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
            return -1;
        } else {
            return 0;
        }
    }
}
