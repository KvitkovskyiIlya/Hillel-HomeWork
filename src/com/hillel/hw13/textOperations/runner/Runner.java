package com.hillel.hw13.textOperations.runner;

import com.hillel.hw13.textOperations.utils.TextUtils;

import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        TextUtils text = new TextUtils();
        List<String> list = text.createListOfText();
        printWordsAndCount(text.toMap(list));
        text.writeText(text.reverse(text.getList()));
    }

    public static void printWordsAndCount(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println((pair) + " ");
        }
    }
}
