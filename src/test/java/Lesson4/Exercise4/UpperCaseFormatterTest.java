package Lesson4.Exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseFormatterTest {

  @Test
  void shouldUpperCaseLetters() {
    //given
    String text = "Ala ma Kota";

    //when
    UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
    String formattedText = upperCaseFormatter.formattedText(text);

    //then
    Assertions.assertEquals("ALA MA KOTA", formattedText);
  }
}