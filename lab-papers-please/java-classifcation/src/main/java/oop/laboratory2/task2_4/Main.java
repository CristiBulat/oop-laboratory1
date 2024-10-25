package oop.laboratory2.task2_4;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please provide the file path!");
            return;
        }

        String filePath = args[0];
        Counter counter = new Counter();

        FileReader fileReader = new FileReader();
        String fileData = fileReader.readFileIntoString(filePath);

        TextData data = new TextData(filePath, fileData, counter.countVowels(fileData), counter.countConsonants(fileData), counter.countLetters(fileData), counter.countSentences(fileData), counter.findLongestWord(fileData));

        System.out.println("File Name: " + data.getFileName());
        System.out.println("Number of Vowels: " + data.getNumberOfVowels());
        System.out.println("Number of Consonants: " + data.getNumberOfConsonants());
        System.out.println("Number of Letters: " + data.getNumberOfLetters());
        System.out.println("Number of Sentences: " + data.getNumberOfsentences());
        System.out.println("Longest Word: " + data.getLongestWord());
        System.out.println();
        System.out.println("Text: " + data.getText());
    }
}
