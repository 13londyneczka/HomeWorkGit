package Lesson6.Exercise3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextUtils {
  public static void displayTheNumbersOfCharacters(String pathname){
    File file = new File("D:\\data.txt");
    try {
      Files.readString(Paths.get("D:\\data.txt"));
      System.out.println(file.length());
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}