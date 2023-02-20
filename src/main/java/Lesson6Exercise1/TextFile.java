package Lesson6Exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFile {
    public static void createNewFile() {

        File file = new File("D:\\data.txt");
        writeToFileNew("D:\\data.txt", "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku");
    }
    public static void writeToFileNew(String pathToFile, String text){
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}