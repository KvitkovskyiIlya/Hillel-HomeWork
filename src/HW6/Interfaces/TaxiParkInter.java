package HW6.Interfaces;

import HW6.Implements.Car;

public interface TaxiParkInter {
    int coastOfTaxiPark();

    Car[] searchCarsForSpeed(int minSpeed, int maxSpeed);

    Car[] fuelConsumption();
}
