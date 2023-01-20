package Lesson2.Exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayValidatorTest {

    @Test
    void printDayOfWeek() {
        String printDayOfWeek = DayValidator.printDayOfWeek(3);
        Assertions.assertEquals("Wednesday",printDayOfWeek);
    }
}