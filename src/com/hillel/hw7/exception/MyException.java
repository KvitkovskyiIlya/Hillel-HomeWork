package com.hillel.hw7.exception;

public class MyException extends Exception {
    private int min;
    private int max;

    public MyException(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
