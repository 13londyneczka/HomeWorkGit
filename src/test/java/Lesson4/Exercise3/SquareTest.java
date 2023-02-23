package Lesson4.Exercise3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  void shouldCalculateTheAreaOfTheSquare() {
    Square square = new Square(5);
    double getArea = square.getArea();
    Assertions.assertEquals(25, getArea);
  }

  @Test
  void shouldCalculateThePerimeterOfTheSquare() {
    Square square = new Square(10);
    double getPerimeter = square.getPerimeter();
    Assertions.assertEquals(40, getPerimeter);
  }
}