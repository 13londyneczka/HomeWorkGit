package Lesson4.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateCircleArea() {
        //given
        Circle circle = new Circle(7);
        //when
        double area = circle.getArea();
        //then
        Assertions.assertEquals(153.93804002589985, area);
    }

    @Test
    void shouldCalculateCirclePerimeter() {
        //given
        Circle circle = new Circle(7);
        //when
        double perimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(43.982297150257105338477007365, perimeter);
    }
}