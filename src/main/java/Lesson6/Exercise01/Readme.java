package Lesson6.Exercise01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Readme {
    public static void main(String[] args) {
        File file = new File("D:\\data.txt");

        try {
            String text = Files.readString(Paths.get("D:\\data.txt"));
            System.out.println(text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
