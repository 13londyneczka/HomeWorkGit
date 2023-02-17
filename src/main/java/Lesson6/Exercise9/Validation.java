package Lesson6.Exercise9;

public class Validation {
  public static String numberDivisibleBy3(int i){
    if (i % 3 == 0){
      System.out.println("Liczba jest podzielna przez 3");
    } else if (i % 3  != 0){
      return IllegalArgumentException;
    }
  }
}
