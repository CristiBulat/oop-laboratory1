package oop.laboratory2.task2_4;

import java.util.Arrays;
import java.util.Comparator;

public class Counter {
    public int countVowels(String text) {
        return (int) text.chars().filter(c ->"AEIOUaeiou".indexOf(c) != -1).count();
    }

    // Count total consonants in the text
    public int countConsonants(String text) {
        return (int) text.chars()
                .filter(c -> Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1)
                .count();
    }

    // Count total letters in the text
    public int countLetters(String text) {
        return (int) text.chars()
                .filter(Character::isLetter)
                .count();
    }

    // Count sentences using common sentence-ending punctuation
    public int countSentences(String text) {
        return text.split("[.!?]").length;
    }

    // Find the longest word in the text
    public String findLongestWord(String text) {
        return Arrays.stream(text.split("\\W+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}