package Lesson4.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class CircleTest {

    @Test
    void shouldCalculateCircleArea() {
    Circle circle = new Circle(7);
    double getArea = circle.getArea();
        Assertions.assertEquals(153.93804002589985, getArea);
    }

    @Test
    void shouldCalculateCirclePerimeter() {
        Circle circle = new Circle(7);
        double getPerimeter = circle.getPerimeter();
        Assertions.assertEquals(43.982297150257105338477007365, getPerimeter);
    }
}