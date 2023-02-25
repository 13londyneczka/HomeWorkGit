package Lesson10.Exercise4;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> numbers = List.of(
        "342",
        "5.34",
        "756",
        "1.234e+07",
        "7.234243E-02",
        "6.09",
        "3457",
        "87",
        "1.0001",
        "3",
        "5"
    );
    NumberPicker numberPicker = new NumberPicker();
    List<String> integers = numberPicker.getIntegers(numbers);
    List<String> doubles = numberPicker.getDoubles(numbers);
    List<String> scientificNotation = numberPicker.getScientificNotation(numbers);
    System.out.println(integers);
    System.out.println(doubles);
    System.out.println(scientificNotation);

  }
}