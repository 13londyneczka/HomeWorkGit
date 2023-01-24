package Lesson2.Excersise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldAddTwoValues() {
        int sum = Calculator.sum(1,1);
        Assertions.assertEquals(2, sum);
    }

    @Test
    void shouldDeductTwoValues() {
        int subtract = Calculator.subtract(5, 3);
        Assertions.assertEquals(2, subtract);
    }

    @Test
    void shouldMultiplyTwoValues() {
        int multiply = Calculator.multiply(2, 3);
        Assertions.assertEquals(6, multiply);
    }

    @Test
    void shouldDivideTwoValues() {
        int division = Calculator.divide(6, 3);
        Assertions.assertEquals(2, division);
    }
}