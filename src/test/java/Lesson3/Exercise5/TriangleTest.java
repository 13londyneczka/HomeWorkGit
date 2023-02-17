package Lesson3.Exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void  shouldBeRectangularTriangle() {
        boolean isItRectangular = Triangle.isRectangular(3,4,5);

        Assertions.assertTrue(isItRectangular);
    }

    @Test
    void  shouldNotBeRectangularTriangle() {
        boolean isItRectangular = Triangle.isRectangular(7,9,10);

        Assertions.assertFalse(isItRectangular);
    }
}
