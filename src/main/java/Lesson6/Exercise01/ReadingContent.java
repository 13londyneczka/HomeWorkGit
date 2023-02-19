package Lesson6.Exercise01;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingContent {

  public static void displayContent(String pathName) {
    try {
      String text = Files.readString(Paths.get(pathName));
      System.out.println(text);
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}
