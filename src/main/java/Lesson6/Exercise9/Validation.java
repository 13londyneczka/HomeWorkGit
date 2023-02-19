package Lesson6.Exercise9;

public class Validation {
  public static void validate(int[] numbers) {

    for (int number : numbers) {
      try {
        if (number % 3 == 0) {
          throw new IllegalArgumentException("Liczba nie jest podzielna przez 3");
        }
      } catch (IllegalCallerException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}