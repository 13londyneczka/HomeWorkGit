package Lesson2.Exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenAndOddNumberTest {

    @Test
    void shouldBeEven() {
        //when
        boolean isEvenNumber = ParityUtils.isEven(6);
        //then
        Assertions.assertTrue(isEvenNumber);
    }

    @Test
    void shouldBeNotEven() {
        //when
        boolean isNotEvenNumber = ParityUtils.isEven(5);
        //then
        Assertions.assertFalse(isNotEvenNumber);

    }

    @Test
    void shouldBeOdd() {
        //when
        boolean isOddNumber = ParityUtils.isOdd(5);
        //then
        Assertions.assertTrue(isOddNumber);
    }

    @Test
    void shouldBeNotOdd() {
        //when
        boolean isNotOddNumber = ParityUtils.isOdd(6);
        //then
        Assertions.assertFalse(isNotOddNumber);
    }
}