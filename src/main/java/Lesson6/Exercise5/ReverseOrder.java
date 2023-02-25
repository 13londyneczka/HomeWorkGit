package Lesson6.Exercise5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReverseOrder {

  public static void main(String[] args) {
    printReversOrder("C:\\Users\\Marysia\\Desktop\\GitRepozytoria\\HomeWorkGit\\src\\main\\resources\\TextFile");
  }

  public static void printReversOrder(String pathName) {
    try {
      String text = Files.readString(Paths.get(pathName));
      StringBuilder stringBuilder = new StringBuilder(text);
      String result = stringBuilder.reverse().toString();
      System.out.println(result);
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}