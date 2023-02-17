package Lesson6.Exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public static void convertContentToUpperCase(String inputFilePath, String outputFilePath) {
        try {
            String text = Files.readString(Path.of(inputFilePath));
            FileWriter.writeToFile(outputFilePath, text.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
