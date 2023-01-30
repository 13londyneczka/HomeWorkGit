package Lesson6.Exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader extends FileWriter{

    public static void convertContentToUpperCase(String filePath) {
        try {
            String text = Files.readString(Path.of(filePath));
            FileWriter.writeToFile("D:\\output.txt", text.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
