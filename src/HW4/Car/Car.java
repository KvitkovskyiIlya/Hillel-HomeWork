package HW4.Car;

public class Car {
    int id;
    String mark;
    String model;
    int yearOfRelease;
    String color;
    int price;
    int registrationNumber;

    public Car (int id, String mark, String model, int yearOfRelease, String color, int price, int registrationNumber){

        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;

    }
    public int years(){
        return 2019 - yearOfRelease;
    }
}

