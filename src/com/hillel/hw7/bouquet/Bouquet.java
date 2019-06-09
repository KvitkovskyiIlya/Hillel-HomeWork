package com.hillel.hw7.bouquet;

import com.hillel.hw7.accessory.implement.Accessory;
import com.hillel.hw7.exception.MyException;
import com.hillel.hw7.flower.implement.Flower;

public class Bouquet implements BouquetInter {
    private Flower[] flowers;
    private Accessory[] accessories;

    public void createBouquet() {
        flowers = new Flower[0];
        accessories = new Accessory[0];
    }

    public void addFlower(Flower flower) {
        flowers = pushFlower(flower, getFlowers());
    }

    public void addAccessory(Accessory accessory) {
        accessories = pushAccessory(accessory, getAccessories());
    }

    public Flower[] pushFlower(Flower flowerArr, Flower[] flowers) {
        Flower[] newArr = new Flower[flowers.length + 1];
        for (int i = 0; i < flowers.length; i++)
            newArr[i] = flowers[i];
        newArr[flowers.length] = flowerArr;
        return newArr;
    }

    public Accessory[] pushAccessory(Accessory accessoryArr, Accessory[] accessories) {
        Accessory[] newArr = new Accessory[accessories.length + 1];
        for (int i = 0; i < accessories.length; i++)
            newArr[i] = accessories[i];
        newArr[accessories.length] = accessoryArr;
        return newArr;
    }

    public String printBouquet(Flower[] flowers, Accessory[] accessories) {
        String result = "Current bouquet\nFlowers:\n";

        for (Flower flower : flowers) {
            result += (flower.toString() + "\n");
        }
        result += "Accessories:\n";
        for (Accessory accessory : accessories) {
            result += (accessory.toString() + "\n");
        }
        return result;
    }

    public int coastOfBouquet() {
        int sum = 0;

        for (Flower flower : getFlowers())
            sum += flower.getPrice();

        for (Accessory accessory : getAccessories())
            sum += accessory.getPrice();

        return sum;
    }

    public Flower[] sortByDayToLive() {
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < flowers.length; j++) {
                if (flowers[j].getDaysToLive() < flowers[i].getDaysToLive()) {
                    Flower temp = flowers[j];
                    flowers[j] = flowers[i];
                    flowers[i] = temp;
                }
            }
        }
        return flowers;
    }

    public Flower[] searchFlowerForStemLength(int minLength, int maxLength) throws MyException {
        if (minLength < 0 || maxLength < 0) {
            throw new MyException(minLength, maxLength);
        }
        Flower[] resultArr = new Flower[0];

        for (Flower flower : getFlowers()) {
            if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength) {
                resultArr = pushFlower(flower, resultArr);
            }
        }
        return resultArr;
    }


    public Flower[] getFlowers() {
        return flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }
}
