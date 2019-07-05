package com.hillel.hw11.main;

import com.hillel.hw11.utils.List;

public class Runner {

    public static void main(String[] args) {

        String[] array = new String[]{"Volvo", "Mercedes", "BMW", "Tesla", "Honda"};

        List<String> list = new List<>();

        list.addAllArray(array);
        System.out.println(list);
        list.addFirst("Lanos");
        System.out.println(list.size());
        System.out.println(list);
        list.addLast("Hyundai");
        System.out.println(list);
        list.addByIndex("Zhiguli", 1);
        System.out.println(list);
        list.removeByIndex(2);
        System.out.println(list);
        list.remove("Volvo");
        System.out.println(list);
        list.reversByIndex(3, 4);
        System.out.println(list);
        list.isEmpty();
    }
}
