package HW4.Car;

public class Processor {
    private Car[] arrayCars;

    Processor(Car[] arrayCars){
        this.arrayCars = arrayCars;
    }

    Processor(){
        this.arrayCars = null;
    }

    public void printCars(Car cars) {
        System.out.println("Car id = " + cars.id + ", Mark = " + cars.mark + ", Model =  " + cars.model +
                ", Year Of Release =  " + cars.yearOfRelease + ", Color = " + cars.color +
                ", Price = " + cars.price + ", Registration number = " + cars.registrationNumber);
    }

    public void findCarsByMark(Car[] cars, String mark) {
        System.out.println("List of cars by mark = " + mark);
        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printCars(car);
            }
        }
    }
    // Overloaded Method
    public void findCarsByMark(String mark){
        if(this.arrayCars != null){
            findCarsByMark(this.arrayCars, mark);
        }
    }


    public void listOfCarsThatHaveBeenOperatedForMoreYears(Car[] cars, String model, int years) {
        System.out.println("The list of cars that have been operated for more years = " + model + " " + years);
        for (Car car : cars) {
            if (car.model.equals(model) && car.years() > years) {
                printCars(car);
            }
        }
    }

    // Overloaded Method
    public void listOfCarsThatHaveBeenOperatedForMoreYears(String model, int years){
        if (this.arrayCars != null){
            listOfCarsThatHaveBeenOperatedForMoreYears(this.arrayCars, model, years);
        }
    }


    public void searchForCarsForMoreThanTheSpecified(Car[] cars, int yearOfRelease, int price) {
        System.out.println("List of cars of a given year of release, the price of which is higher than the specified - " + yearOfRelease + " " + price);
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].yearOfRelease == yearOfRelease) {
                if (cars[i].price > price) {
                    printCars(cars[i]);
                }
            }
        }
    }

    // Overloaded Method
    public void searchForCarsForMoreThanTheSpecified(int yearOfRelease, int price){
        if (this.arrayCars != null){
            searchForCarsForMoreThanTheSpecified(this.arrayCars,yearOfRelease, price);
        }
    }
}
