package Lesson2.Exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddNumberTest {

    @Test
    void isEvenNumber() {
        boolean isEvenNumber = EvenAndOddNumber.isEvenNumber(6);
        Assertions.assertEquals(true,isEvenNumber);
    }
}