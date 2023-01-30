package Lesson6.Exercise6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {

    public static void writeToFile(String pathToFile, String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToFile))) {
            writer.write(text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
