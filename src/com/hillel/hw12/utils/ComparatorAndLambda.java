package com.hillel.hw12.utils;

import HW6.Interfaces.CarInter;
import HW6.lambda.CarComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorAndLambda {

    Comparator<CarInter> comparator = new Comparator<CarInter>() {
        @Override
        public int compare(CarInter o1, CarInter o2) {

            if (o1.getFuelConsumption() > o2.getFuelConsumption()) {
                return 1;
            } else if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    Comparator<CarInter> lambdaExpression = (CarInter o1, CarInter o2) -> {
        if (o1.getFuelConsumption() > o2.getFuelConsumption()) {
            return 1;
        } else if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
            return -1;
        } else {
            return 0;
        }
    };

        System.out.println(" Three new Methods");
        System.out.println(Arrays.toString(park.sort(comparator)));
        System.out.println(Arrays.toString(park.sort(lambdaExpression)));
        System.out.println(Arrays.toString(park.sort(CarComparator::compareToFuelConsumption)));
}
