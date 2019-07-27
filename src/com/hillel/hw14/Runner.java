package com.hillel.hw14;

public class Runner {
    public static void main(String[] args) {
        String text = "Say your players little one\n" +
                "don't forget my son,\n" +
                "to include everyone!\n" +
                "Tuck you in warm within\n" +
                "keep you free from sin.\n" +
                "till the - sandman he comes\n" +
                "Sleep with one eye open\n" +
                "gripping; your pillow tight";

        Utils utils = new Utils();
        System.out.println(utils.numberOfRepetitionsWords(text));
        System.out.println(utils.replace(text));
        System.out.println(utils.numberOfPunctuationMarks(text));
        utils.matchOfFirstLetterWithLast(text);
    }
}
