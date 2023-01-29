package Lesson6.Exercise4;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordSearch {

    public static void searchWordInText(String filePath, String searchWord) {
        try {
            String text = Files.readString(Path.of(filePath));
            System.out.println(text.contains(searchWord));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
