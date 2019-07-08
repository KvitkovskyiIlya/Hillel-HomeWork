package com.hillel.hw10.exception;

public class SearchCarForSpeedException extends Exception {
    private int min;
    private int max;

    public SearchCarForSpeedException(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "SearchCarForSpeedException{" +
                "min = " + min +
                ", max = " + max +
                "} " + super.toString();
    }
}
