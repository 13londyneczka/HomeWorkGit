package Lesson4.Exercise4;

public class LowerCaseFormatter implements TextFormatter {

  @Override
  public String formattedText(String text) {
    return text.toLowerCase();
  }
}
