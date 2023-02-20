package Lesson6.Exercise7;

public class NumberChecker {
  public static boolean IsEven(int value) {
    return value % 2 == 0;}

  public static int sumOfDigitOfGivenNumber(int value) {
    int sum = 0;

    while (value > 0) {
      sum += value % 10;
      value /=10;
    }
    return sum;
  }
}
