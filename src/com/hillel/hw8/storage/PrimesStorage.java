package com.hillel.hw8.storage;

import java.util.Arrays;

public class PrimesStorage {
    private int[] primes = {};

    public synchronized void addPrimes(int[] primesToAdd) {
        int previousArrayLength = primes.length;
        primes = Arrays.copyOf(primes, previousArrayLength + primesToAdd.length);

        for (int i = 0; i < primesToAdd.length; i++) {
            primes[previousArrayLength++] = primesToAdd[i];

        }
    }

    public int[] getPrimes() {
        return primes;
    }

    public void setPrimes(int[] primes) {
        this.primes = primes;
    }
}
