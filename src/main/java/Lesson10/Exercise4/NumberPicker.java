package Lesson10.Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPicker {
  public List<String> getIntegers(List<String> numbers) {
    return getNumbers(numbers, "^[+-]?[0-9]+$");
  }

  public List<String> getDoubles(List<String> numbers) {
    return getNumbers(numbers, "^[+-]?([0-9]*)[.]{1}[0-9]+$");
  }

  public List<String> getScientificNotation(List<String> numbers) {
    return getNumbers(numbers, "^(?:-?\\d*)\\.?\\d+[eE][-\\+]?\\d+$");
  }

  public List<String> getNumbers(List<String> numbers, String regex) {
    Pattern pattern = Pattern.compile(regex);

    List<String> results = new ArrayList<>();
    for (String number : numbers) {
      Matcher matcher = pattern.matcher(number);
      if (matcher.matches()) {
        results.add(number);
      }
    }
    return results;
  }
}
