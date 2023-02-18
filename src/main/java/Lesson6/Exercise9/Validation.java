package Lesson6.Exercise9;

public class Validation {
  public static void validate(int number) {
    if (number % 3 == 0) {
      System.out.println("Liczba jest podzielna przez 3");
    } else if (number % 3 != 0) {
      throw new IllegalArgumentException(" Liczba jest niepodzielna przez 3");
    }

    Validation validation = new Validation(validate(number));
    try {
      validation.validate(number);
    } catch (IllegalArgumentException){
      exception.printStackTrace();
    }
  }
}