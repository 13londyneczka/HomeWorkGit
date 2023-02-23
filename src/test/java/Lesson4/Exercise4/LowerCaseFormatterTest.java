package Lesson4.Exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseFormatterTest {

  @Test
  void shouldLowerCaseLetters() {
    //given
    String text = "ALA ma kotA";

    //when
    LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();
    String formatText = lowerCaseFormatter.formatText(text);

    //then
    Assertions.assertEquals("ala ma kota", formatText);
  }
}