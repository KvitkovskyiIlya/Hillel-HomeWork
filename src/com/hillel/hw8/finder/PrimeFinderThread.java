package com.hillel.hw8.finder;

import com.hillel.hw8.storage.PrimesStorage;

public class PrimeFinderThread implements Runnable {
    private int minNumber;
    private int maxNumber;
    private PrimesStorage storage;

    public PrimeFinderThread(int minNumber, int maxNumber, PrimesStorage storage) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.storage = storage;
    }

    @Override
    public void run() {
        int[] findPrimeNumbers = {};

        for (int i = minNumber; i < maxNumber; i++) {
            if (isPrime(i)) {
                int previousArrayLength = findPrimeNumbers.length;
                findPrimeNumbers = arrayExpansion(findPrimeNumbers, previousArrayLength + 1);
                findPrimeNumbers[previousArrayLength] = i;

            }
        }
        storage.addPrimes(findPrimeNumbers);
    }

    public int[] arrayExpansion(int[] findPrimeNumbers, int lengthToAdd) {
        int newArr[] = new int[findPrimeNumbers.length + 1];
        for (int i = 0; i < findPrimeNumbers.length; i++) {
            newArr[i] = findPrimeNumbers[i];
            newArr[findPrimeNumbers.length] = lengthToAdd;
        }
        return newArr;

    }

    private boolean isPrime(int number) {
        boolean prime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public PrimesStorage getStorage() {
        return storage;
    }

    public void setStorage(PrimesStorage storage) {
        this.storage = storage;
    }

}
