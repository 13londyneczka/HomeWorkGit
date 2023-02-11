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
        double getArea = circle.getArea();
        //then
        Assertions.assertEquals(153.93804002589985, getArea);
    }

    @Test
    void shouldCalculateCirclePerimeter() {
        //given
        Circle circle = new Circle(7);
        //when
        double getPerimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(43.982297150257105338477007365, getPerimeter);
    }
}