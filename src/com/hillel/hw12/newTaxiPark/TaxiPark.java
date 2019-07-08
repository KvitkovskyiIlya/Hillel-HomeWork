package com.hillel.hw12.newTaxiPark;

import HW6.Implements.Car;

import java.util.Arrays;
import java.util.Comparator;

public class TaxiPark {

    public Car[] sort(Comparator<? super Car> comparator) {
        Arrays.sort(taxiPark, comparator);
        return taxiPark;
    }
}
