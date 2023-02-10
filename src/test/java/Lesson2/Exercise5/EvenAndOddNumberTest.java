package Lesson2.Exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddNumberTest {

    @Test
    void shouldBeEven() {
        boolean isEvenNumber = EvenAndOddNumber.isEvenNumber(6);
        Assertions.assertTrue(isEvenNumber);
    }

    @Test
    void shouldBeNotEven() {
        boolean isNotEvenNumber = EvenAndOddNumber.isEvenNumber(5);
        Assertions.assertFalse(isNotEvenNumber);

    }

    @Test
    void shouldBeOdd() {
        boolean isOddNumber = EvenAndOddNumber.isOddNumber(5);
        Assertions.assertTrue(isOddNumber);
    }

    @Test
    void shouldBeNotOdd() {
        boolean isNotOddNumber = EvenAndOddNumber.isOddNumber(6);
        Assertions.assertFalse(isNotOddNumber);
    }
}