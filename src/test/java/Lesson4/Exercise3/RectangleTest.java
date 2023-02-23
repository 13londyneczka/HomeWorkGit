package Lesson4.Exercise3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

  @Test
  void shouldCalculateTheAreaTheRectangle() {
    Rectangle rectangle = new Rectangle(15, 10);
    double getArea = rectangle.getArea();
    Assertions.assertEquals(150, getArea);
  }

  @Test
  void shouldCalculateTheAreaRectangle() {
    Rectangle rectangle = new Rectangle(10, 5);
    double getPerimeter = rectangle.getPerimeter();
    Assertions.assertEquals(30, getPerimeter);
  }
}