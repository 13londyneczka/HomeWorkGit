package Lesson4.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCalculateSquareArea() {
        Square square = new Square(5);
        double getArea = square.getArea();
        Assertions.assertEquals(25, getArea);
    }

    @Test
    void shouldCalculateSquarePerimeter() {
        Square square = new Square(16);
        double getPerimeter = square.getPerimeter();
        Assertions.assertEquals(64, getPerimeter);
    }
}