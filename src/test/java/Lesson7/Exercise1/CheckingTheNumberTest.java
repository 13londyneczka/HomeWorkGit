package Lesson7.Exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingTheNumberTest {

    @ParameterizedTest
    @ValueSource (ints = {14, 8, 12, 16, 18, 26, 30})
    void shouldVerifyNumberIsEven(int number) {
        Assertions.assertTrue(CheckingTheNumber.isEven(number));
    }

    @ParameterizedTest
    @ValueSource (ints = {5, 9, 13, 17, 19, 27, 31})
    void shouldVerifyNumberIsEven(int number) {
        Assertions.assertTrue(CheckingTheNumber.isEven(number));
    }

    @ParameterizedTest
    @CsvSource (int = {"123 : 6", "345 : 12", "456 : 15", "567 : 18"}, delimiter = ":")
    void shouldCalculateSumOfDigitsOfGivenNumber() {
        shouldCalculateSumOfDigitsOfGivenNumber(CheckingTheNumber, 0);
    }

    @ParameterizedTest
    @CsvSource (int = {"123 : 6", "345 : 12", "456 : 15", "567 : 18"}, delimiter = ":")
    void shouldCalculateSumOfDigitsOfGivenNumber(int number, int expected) {
        int actualInt = CheckingTheNumber.sumFfTheDigitsOfTheGivenNumber(number);
        Assertions.assertEquals(expected, actualInt);
    }
}