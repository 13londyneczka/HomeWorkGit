package Lesson4.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateTriangleArea() {
        Triangle triangle = new Triangle(3,4,4,5);
        double getArea = triangle.getArea();
        Assertions.assertEquals(6, getArea);
    }

    @Test
    void shouldCalculateTrianglePerimeter() {
        Triangle triangle = new Triangle(6,8,8,10);
        double getPerimeter = triangle.getPerimeter();
        Assertions.assertEquals(24, getPerimeter);
    }
}