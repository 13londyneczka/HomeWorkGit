package Lesson6.Exercise9;

public class Validation extends Main{
  public static void validate(int i) {
    if (i % 3 == 0) {
      System.out.println("Liczba jest podzielna przez 3");
    } else if (i % 3 != 0) {
      System.out.println("Liczba nie jest podzielna przez 3");
    }
  }
}