package com.hillel.hw7.menu;

import com.hillel.hw7.accessory.implement.Accessory;
import com.hillel.hw7.accessory.Card;
import com.hillel.hw7.accessory.Paper;
import com.hillel.hw7.accessory.Tape;
import com.hillel.hw7.bouquet.Bouquet;
import com.hillel.hw7.exception.MyException;
import com.hillel.hw7.flower.*;
import com.hillel.hw7.flower.implement.Flower;

import java.util.Scanner;

public class ConsoleMenu {

    private Bouquet bouquet = new Bouquet();
    private boolean exit;

    public void runnerMenu() {
        bouquet.createBouquet();
        do {
            optionOne();
            int input = userChoose();
            switch (input) {
                case 1:
                    int input1 = -1;
                    while (input1 != 0)
                        input1 = menuForAddFlowerAndAccessories(input1);
                    break;
                case 2:
                    int input5 = -1;
                    while (input5 != 0)
                        input5 = bouquetOperations(input5);
                    break;
                case 3:
                    String bouquet = this.bouquet.printBouquet(this.bouquet.getFlowers(), this.bouquet.getAccessories());
                    System.out.println(bouquet);
                    break;
                case 0:
                    exit = true;
                    break;
            }
        } while (!exit);
    }


    private int menuForAddFlowerAndAccessories(int input1) {
        optionTwo();
        input1 = userChoose();
        switch (input1) {

            case 1:
                int input2 = -1;
                while (input2 != 0)
                    input2 = addFlower(input2);
                break;
            case 2:
                int input3 = -1;
                while (input3 != 0)
                    input3 = addAccessories(input3);
            case 0:
                break;

        }
        return input1;
    }

    private int addFlower(int input2) {
        optionThree();
        input2 = userChoose();
        switch (input2) {

            case 1:
                Flower orchids = new Orchids();
                bouquet.addFlower(orchids);
                break;
            case 2:
                Flower pansies = new Pansies();
                bouquet.addFlower(pansies);
                break;
            case 3:
                Flower dandelion = new Dandelion();
                bouquet.addFlower(dandelion);
                break;
            case 4:
                Flower rose = new Rose();
                bouquet.addFlower(rose);
                break;
            case 0:
                break;
        }
        return input2;
    }

    private int addAccessories(int input3) {
        optionFour();
        input3 = userChoose();
        switch (input3) {

            case 1:
                Accessory tape = new Tape();
                bouquet.addAccessory(tape);
                break;
            case 2:
                Accessory card = new Card();
                bouquet.addAccessory(card);
                break;
            case 3:
                Accessory paper = new Paper();
                bouquet.addAccessory(paper);
                break;
            case 0:
                break;
        }
        return input3;
    }

    private int bouquetOperations(int input4) {
        optionFive();

        input4 = userChoose();
        switch (input4) {

            case 1:
                int input2 = -1;
                while (input2 != 0)
                    input2 = addFlower(input2);
                break;
            case 2:
                int input3 = -1;
                while (input3 != 0)
                    input3 = addAccessories(input3);
                break;
            case 3:
                Flower[] flowers;
                flowers = bouquet.sortByDayToLive();
                for (Flower flower : flowers)
                    System.out.println(flower);
                break;
            case 4:
                System.out.println("Cost of bouquet = " + bouquet.coastOfBouquet() + "$");
            case 5:
                try {
                    Flower[] foundOfFlowers;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Input min stem length: ");
                    int minLength = scanner.nextInt();
                    System.out.println("Input max stem length: ");
                    int maxLength = scanner.nextInt();
                    foundOfFlowers = bouquet.searchFlowerForStemLength(minLength, maxLength);
                    for (Flower flower : foundOfFlowers)
                        System.out.println(flower);
                } catch (MyException e) {
                    System.out.println("Exception warning " + e);
                }
                break;

            case 0:
                break;

        }

        return input4;
    }

    private void optionOne() {
        System.out.println("1 - Create bouquet");
        System.out.println("2 - Bouquets operations");
        System.out.println("3 - Print current bouquet");
        System.out.println("0 - Exit");
    }

    private void optionTwo() {
        System.out.println("1 - Add flower to bouquet");
        System.out.println("2 - Add accessory to bouquet");
        System.out.println("0 - Exit");
    }

    private void optionThree() {
        System.out.println("1 - Orchids");
        System.out.println("2 - Pansies");
        System.out.println("3 - Dandelion");
        System.out.println("4 - Rose");
        System.out.println("0 - Exit");
    }

    private void optionFour() {
        System.out.println("1 - Tape");
        System.out.println("2 - Card");
        System.out.println("3 - Paper");
        System.out.println("0 - Exit");
    }

    private void optionFive() {
        System.out.println("1 - Add flower to bouquet");
        System.out.println("2 - Add accessory to bouquet");
        System.out.println("3 - Sort flowers by day to live");
        System.out.println("4 - Prise of bouquet");
        System.out.println("5 - Find flowers by stem length");
        System.out.println("0 - Exit");
    }

    private int userChoose() {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        return scan;
    }
}
