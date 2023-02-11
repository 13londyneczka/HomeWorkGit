package Lesson6.Exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EverySecondLine {

    public static void main(String[] args) {
        String filePath = "data.txt";
        printEverySecondLine(filePath);
    }

    private static void printEverySecondLine(String filePath) {
        try {
            String fileContent = Files.readString(Path.of(filePath));
            String[] lines = fileContent.split("\n");
            for (int i = 0; i < lines.length; i += 2) {
                System.out.println(lines[i]);
            }
        }catch(IOException e){
                throw new RuntimeException(e);
        }
    }
}
