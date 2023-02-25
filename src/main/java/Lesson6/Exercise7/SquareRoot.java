package Lesson6.Exercise7;

import static java.lang.Math.sqrt;

public class SquareRoot {
  public static double square(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("Z liczby ujemnej nie można zrobić pierwiastka");
    } else {
      return Math.sqrt(number);
    }
  }
}
