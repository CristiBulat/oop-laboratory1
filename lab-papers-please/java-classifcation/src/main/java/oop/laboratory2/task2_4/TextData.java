package oop.laboratory2.task2_4;
import java.util.Arrays;
import java.util.Comparator;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfsentences;
    private String longestWord;

    public TextData(String fileName,String text, int numberOfVowels, int numberOfConsonants, int numberOfLetters, int numberOfsentences, String longestWord){
        this.fileName = fileName;
        this.text = text;
        this.numberOfVowels = numberOfVowels;
        this.numberOfConsonants = numberOfConsonants;
        this.numberOfLetters = numberOfLetters;
        this.numberOfsentences = numberOfsentences;
        this.longestWord = longestWord;
    }

    public String getFileName(){
        return fileName;
    }

    public String getText(){
        return text;
    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfsentences() {
        return numberOfsentences;
    }

    public String getLongestWord() {
        return longestWord;
    }

}
