package Lesson2.Exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddNumberTest {

    @Test
    void isEvenNumber() {
        boolean isEvenNumber = EvenAndOddNumber.isEvenNumber(6);
        Assertions.assertEquals(true, isEvenNumber);
    }
        @Test
    void isOddNumber() {
        boolean isOddNumber = EvenAndOddNumber.isOddNumber(5);
        Assertions.assertEquals(true, isOddNumber);
    }
}