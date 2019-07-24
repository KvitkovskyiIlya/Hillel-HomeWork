package com.hillel.hw13.newLinkedList;

import com.hillel.hw13.newLinkedList.List;

import java.util.Iterator;

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

        System.out.println();
        System.out.println();
        System.out.println();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
