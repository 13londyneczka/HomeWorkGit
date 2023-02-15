package Lesson4.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateRectangleArea() {
        //given
        Rectangle rectangle = new Rectangle(5, 8);
        //when
        double area = rectangle.getArea();
        //then
        Assertions.assertEquals(40, area);
    }

    @Test
    void shouldCalculateRectanglePerimeter() {
        //given
        Rectangle rectangle = new Rectangle(4, 7);
        //when
        double perimeter = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(22, perimeter);
    }
}