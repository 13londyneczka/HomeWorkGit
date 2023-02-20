package Lesson7.Exercise2;

public class StringUtils {

  public static String toUpperCase(String input) {
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null");
    }
    return input.toUpperCase();
  }
}