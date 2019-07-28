package com.hillel.hw14;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public String replace(String text) {
        Pattern pattern = Pattern.compile("you(\\w*)");
        Matcher matcher = pattern.matcher(text);
        String string = matcher.replaceAll("Python");

        return string;
    }

    public int numberOfPunctuationMarks(String text) {
        Pattern pattern = Pattern.compile("[.,:;!?-]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public void matchOfFirstLetterWithLast(String text) {

        String[] str = text.split("\\W");
        for (int i = 0; i < str.length; ++i) {
            if (str[i].length() > 1 && str[i].charAt(0) == str[i].charAt(str[i].length() - 1)) {
                System.out.println(str[i]);
            }
        }

    }

    public Map<String, Integer> numberOfRepetitionsWords(String text) {
        String[] words = text.toLowerCase().replaceAll("[-.,!?)(:;]", "").split("\\s");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
                continue;
            }
            map.put(word, 1);
        }

        return map;
    }

}
