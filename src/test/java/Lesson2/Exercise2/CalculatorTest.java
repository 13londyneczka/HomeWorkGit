package Lesson2.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        //given
        int value1 =1;
        int value2 =1;
        //when
        int sum = Calculator.sum(value1, value2);
        //then
        Assertions.assertEquals(2, sum);
    }
}