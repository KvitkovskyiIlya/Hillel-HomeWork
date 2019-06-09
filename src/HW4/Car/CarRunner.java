package HW4.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(1, "BMW", "M6", 2015, "Black", 30000, 1331),
                new Car(2, "Mercedes", "AMG", 2018, "Red", 50000, 9451),
                new Car(3, "Audi", "TT", 2017, "Grey", 120000, 353),
                new Car(4, "Bentley", "Classic", 2017, "Black", 500000,12345),
                new Car(5, "Lamborghini", "Galardo", 2011, "Yellow", 90000, 5468)
        };

        Processor processor = new Processor();

        processor.findCarsByMark(cars, "Mercedes");
        processor.listOfCarsThatHaveBeenOperatedForMoreYears(cars, "Galardo", 5);
        processor.searchForCarsForMoreThanTheSpecified(cars, 2017, 100000);

    }
}
