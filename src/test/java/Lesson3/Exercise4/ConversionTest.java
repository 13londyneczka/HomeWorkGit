package Lesson3.Exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    @Test
    void shouldBeConvertingMinutesToSeconds() {
        //when
        int convertingMinutesToSeconds = Conversion.convertingMinutesToSeconds(2);
        //then
        Assertions.assertEquals(120, convertingMinutesToSeconds);
    }
}