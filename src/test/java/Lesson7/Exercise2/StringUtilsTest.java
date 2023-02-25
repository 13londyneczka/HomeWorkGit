package Lesson7.Exercise2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

class StringUtilsTest {

  @ParameterizedTest
  @ValueSource(strings = {"hello", "world", "UPPERCASE ME"})
  void shouldConvertToUpperCase(String input) {
    String expected = input.toUpperCase();
    String actual = StringUtils.toUpperCase(input);
    assertEquals(expected, actual);
  }

  @Test
  void shouldThrowExceptionForNullInput() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      StringUtils.toUpperCase(null);
    });

    assertEquals("Input cannot be null", exception.getMessage());
  }
}