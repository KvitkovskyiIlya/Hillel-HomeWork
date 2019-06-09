package com.hillel.hw7.bouquet;

import com.hillel.hw7.accessory.implement.Accessory;
import com.hillel.hw7.exception.MyException;
import com.hillel.hw7.flower.implement.Flower;

public interface BouquetInter {
    void createBouquet();
    void addFlower(Flower flower);
    void addAccessory(Accessory accessory);
    Flower [] pushFlower(Flower flowerToAdd, Flower [] flowers);
    Accessory [] pushAccessory(Accessory accessoryToAdd, Accessory [] accessories);
    String printBouquet(Flower [] flowers, Accessory [] accessories);
    Flower [] sortByDayToLive();
    Flower[] searchFlowerForStemLength(int minLength, int maxLength) throws MyException;
    int coastOfBouquet();
}
