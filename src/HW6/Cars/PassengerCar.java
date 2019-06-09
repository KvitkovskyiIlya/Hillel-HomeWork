package HW6.Cars;

import HW6.Implements.Car;

public class PassengerCar extends Car {
    private int numberOfPassengers;

    public PassengerCar(String mark, int price, int fuelConsumption, int maxSpeed, int numberOfPassengers) {
        super(mark, price, fuelConsumption, maxSpeed);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "PassengerCar {" + " Mark = " + getMark() + " Price = " + getPrice() + " Fuel Consumption = " + getFuelConsumption() +
                " Max Speed " + getMaxSpeed() +
                " number Of Passengers = " + numberOfPassengers +
                '}';
    }
}
