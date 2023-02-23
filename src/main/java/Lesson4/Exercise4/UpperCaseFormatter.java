package Lesson4.Exercise4;

public class UpperCaseFormatter implements TextFormatter {
  @Override
  public String formatText(String text) {
    return text.toUpperCase();
  }
}
