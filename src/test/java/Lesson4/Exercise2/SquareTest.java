package Lesson4.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCalculateSquareArea() {
        //given
        Square square = new Square(5);
        //when
        double area = square.getArea();
        //then
        Assertions.assertEquals(25, area);
    }

    @Test
    void shouldCalculateSquarePerimeter() {
        //given
        Square square = new Square(16);
        //when
        double perimeter = square.getPerimeter();
        //then
        Assertions.assertEquals(64, perimeter);
    }
}