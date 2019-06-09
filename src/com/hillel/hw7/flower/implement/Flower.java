package com.hillel.hw7.flower.implement;

import com.hillel.hw7.flower.FlowerInter;

abstract public class Flower implements FlowerInter {
    private String name;
    private int price;
    private int daysToLive;
    private int stemLength;

    public Flower(String name, int price, int daysToLive, int stemLength){
        this.name=name;
        this.price=price;
        this.daysToLive =daysToLive;
        this.stemLength=stemLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDaysToLive() {
        return daysToLive;
    }

    public void setDaysToLive(int daysToLive) {
        this.daysToLive = daysToLive;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    @Override
    public String toString() {
        return "Flower { " +
                "name = ' " + name + '\'' +
                ", price = " + price +
                ", daysToLive = " + daysToLive +
                ", stemLength = " + stemLength +
                '}';
    }
}
