package com.hillel.hw13.textOperations.utils;

import java.io.*;
import java.util.*;

public class TextUtils {
    LinkedList<String> list = readFile();


    public LinkedList<String> readFile() {
        LinkedList<String> list = new LinkedList<>();
        FileInputStream fis;
        byte[] readBytes = new byte[0];

        try {
            fis = new FileInputStream("Text.txt");

            readBytes = new byte[fis.available()];

            fis.read(readBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String file = new String(readBytes);

        String[] textString = file.split(" ");

        for (int i = 0; i < textString.length; i++) {
            list.add(textString[i]);
        }
        return list;
    }


    public LinkedList<String> reverse(LinkedList<String> list) {
        Collections.reverse(list);
        return list;
    }

    public List<String> createListOfText() {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Text.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {

                list.add(line);

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return list;
    }

    public Map<String, Integer> toMap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String line : list) {

            String words[] = line.split(" ");

            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                    continue;
                }
                map.put(word, 1);
            }

        }
        return map;
    }

    public void writeText(LinkedList<String> list) {

        try (FileWriter writer = new FileWriter("ReverseResult.txt")) {

            for (int i = 0; i < list.size(); i++) {

                writer.write(list.get(i) + " ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public LinkedList<String> getList() {
        return list;
    }
}


