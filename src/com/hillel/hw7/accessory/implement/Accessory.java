package com.hillel.hw7.accessory.implement;

import com.hillel.hw7.accessory.AccessoryInter;

abstract public class Accessory implements AccessoryInter {
    private String name;
    private int price;

    public Accessory(String name, int price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Accessory { " +
                "name = ' " + name + '\'' +
                ", price = " + price +
                '}';
    }
}
