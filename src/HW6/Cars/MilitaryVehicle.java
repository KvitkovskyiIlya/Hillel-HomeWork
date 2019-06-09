package HW6.Cars;

import HW6.Implements.Car;

public class MilitaryVehicle extends Car {
    private int LevelOfDestruction;

    public MilitaryVehicle(String mark, int price, int fuelConsumption, int maxSpeed, int levelOfDestruction) {
        super(mark, price, fuelConsumption, maxSpeed);
        LevelOfDestruction = levelOfDestruction;
    }

    public int getLevelOfDestruction() {
        return LevelOfDestruction;
    }

    public void setLevelOfDestruction(int levelOfDestruction) {
        LevelOfDestruction = levelOfDestruction;
    }

    @Override
    public String toString() {
        return "MilitaryVehicle {" + " Mark = " + getMark() + " Price = " + getPrice() + " Fuel Consumption = " + getFuelConsumption() +
                " Max Speed = " + getMaxSpeed() +
                " LevelOfDestruction = " + LevelOfDestruction +
                '}';
    }
}
