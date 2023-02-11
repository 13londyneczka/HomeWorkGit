package Lesson4.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateTriangleArea() {
        //given
        Triangle triangle = new Triangle(3, 4, 4, 5);
        //when
        double getArea = triangle.getArea();
        //then
        Assertions.assertEquals(6, getArea);
    }

    @Test
    void shouldCalculateTrianglePerimeter() {
        //given
        Triangle triangle = new Triangle(6, 8, 8, 10);
        //when
        double getPerimeter = triangle.getPerimeter();
        //then
        Assertions.assertEquals(24, getPerimeter);
    }
}