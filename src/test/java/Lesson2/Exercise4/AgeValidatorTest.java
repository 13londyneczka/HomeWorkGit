package Lesson2.Exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AgeValidatorTest {

    @Test
    void shouldIsAdult() {
        boolean isAdult = AgeValidator.isAdult(19);
        Assertions.assertEquals(true, isAdult);
    }
}