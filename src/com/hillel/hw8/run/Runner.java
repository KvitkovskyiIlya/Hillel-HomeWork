package com.hillel.hw8.run;

import com.hillel.hw8.interval.DivideInterval;
import com.hillel.hw8.storage.PrimesStorage;

public class Runner {
    public static void main(String[] args) {

        int minNum = 1;
        int maxNum = 10000;
        int threadsCount = 3;

        PrimesStorage storage = new PrimesStorage();
        DivideInterval divideInterval = new DivideInterval(minNum, maxNum, threadsCount, storage);

        divideInterval.startThreads();

        try {
            divideInterval.joinThreads();
        } catch (InterruptedException e) {

        }

        for (int number : storage.getPrimes()) {
            System.out.print(number + " ");
        }

    }
}
