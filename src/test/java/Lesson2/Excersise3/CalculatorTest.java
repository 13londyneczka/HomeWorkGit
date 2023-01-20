package Lesson2.Excersise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldTwoValues1and1() {
        int sum = Calculator.sum(1,1);
        Assertions.assertEquals(2, sum);
    }

    @Test
    void shouldDeductTwoValues5and3() {
        int subtract = Calculator.subtract(5, 3);
        Assertions.assertEquals(2, subtract);
    }

    @Test
    void shouldMultiplyTwoValues2and3() {
        int multiply = Calculator.multiply(2, 3);
        Assertions.assertEquals(6, multiply);
    }

    @Test
    void shouldDivisionTwoValues6and3() {
        int division = Calculator.division(6, 3);
        Assertions.assertEquals(2, division);
    }
}