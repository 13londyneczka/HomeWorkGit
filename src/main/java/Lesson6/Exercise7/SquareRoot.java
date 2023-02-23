package Lesson6.Exercise7;

import static java.lang.Math.sqrt;

public class SquareRoot {
  public static String square(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("Z liczby ujemnej nie można zrobić pierwiastka");
    } else if(number >= 0){
      System.out.println(sqrt(number));
    }
    return null;
  }
}
