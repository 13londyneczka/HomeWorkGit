package Lesson6.Exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class NumberCheckerTest {

  @ParameterizedTest
  @ValueSource(ints = {4, 8, 12, 16, 18, 26, 30})
  void shouldVerifyNumberIsEven(int number) {
    Assertions.assertTrue(NumberChecker.IsEven(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 9, 13, 17, 19, 27, 31})
  void shouldVerifyNumberIsOdd(int number) {
    Assertions.assertFalse(NumberChecker.IsEven(number));
  }

  @ParameterizedTest
  @CsvSource(value = {"123 : 6", "245: 11", "456: 15", "567 : 18"}, delimiter = ':')
  void shouldCalculateSumOfDigitsOfGivenNumber(int number, int expected) {
    int actualInt = NumberChecker.sumOfDigitOfGivenNumber(number);
    Assertions.assertEquals(expected, actualInt);
  }
}