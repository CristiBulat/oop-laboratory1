package oop.laboratory2.task2_4;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class FileReader{
    public String readFileIntoString(String path){
        Scanner scanner;
        StringBuilder fileContent = new StringBuilder();

        try {
            File file = new File(path);
            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                fileContent.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return fileContent.toString();
    }
}
