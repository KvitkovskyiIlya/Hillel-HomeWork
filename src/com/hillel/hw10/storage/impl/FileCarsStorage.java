package com.hillel.hw10.storage.impl;

import com.hillel.hw10.storage.CarsStorage;
import com.hillel.hw10.car.Car;
import com.hillel.hw10.model.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringJoiner;

public class FileCarsStorage implements CarsStorage {
    private String inputFileName;
    private String outputFileName;

    public FileCarsStorage(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public FileCarsStorage(String fileName) {
        this.inputFileName = fileName;
        this.outputFileName = fileName;
    }

    public Car[] readCars() {

        try (FileInputStream reader = new FileInputStream(inputFileName)) {
            String fileString = CreateString(reader);

            String[] carStrings = fileString.split(";" + System.lineSeparator());

            Car[] cars = new Car[carStrings.length];

            for (int i = 0; i < carStrings.length; i++) {
                String[] carProperties = carStrings[i].split(",");
                switch (carProperties[0]) {
                    case "PassengerCar":
                        cars[i] = new PassengerCar(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                                Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));
                        break;
                    case "Truck":
                        cars[i] = new Truck(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                                Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));
                        break;
                    case "MilitaryVehicles":
                        cars[i] = new MilitaryVehicles(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                                Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));
                        break;
                }
            }

            return cars;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Car[0];
    }

    private String CreateString(FileInputStream reader) throws IOException {
        byte[] fileBytes = new byte[reader.available()];
        reader.read(fileBytes);
        return new String(fileBytes);
    }


    public void writeCars(Car[] cars) {
        try (FileOutputStream writer = new FileOutputStream(outputFileName)) {
            StringJoiner sj = new StringJoiner(";" + System.lineSeparator());
            for (Car car : cars) {
                sj.add(car.toFileFormat());
            }
            writer.write(sj.toString().getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

