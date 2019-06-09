package HW6.Runner;

import HW6.Cars.*;
import HW6.Implements.*;

public class Runner {
    public static void main(String[] args) {
        Car[] taxiPark = new Car[]{
                new Truck("Reno", 65000, 20, 180, 25000),
                new Truck("Scania", 100000, 15, 220, 30000),
                new MilitaryVehicle("T-34", 85000, 50, 35, 5),
                new MilitaryVehicle("T-190", 120000, 70, 60, 10),
                new PassengerCar("Lanos", 5000, 6, 225, 4),
                new PassengerCar("BMW", 10000, 9, 300, 5)
        };

        TaxiPark park = new TaxiPark(taxiPark);

        park.coastOfTaxiPark();
        System.out.println(park);

        park.searchCarsForSpeed(0, 220);
        System.out.println(park);

        park.fuelConsumption();
        System.out.println(park);

    }
}
