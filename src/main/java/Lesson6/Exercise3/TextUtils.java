package Lesson6.Exercise3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextUtils {
  public static void displayTheNumbersOfCharacters(String pathname) {
    try {
      String result = Files.readString(Paths.get(pathname));
      System.out.println(result.length());
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}