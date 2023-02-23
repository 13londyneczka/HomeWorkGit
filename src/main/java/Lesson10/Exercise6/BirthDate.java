package Lesson10.Exercise6;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class BirthDate {

  public static  int getAge(LocalDate dateOfBirth) {
    LocalDate dateNow = LocalDate.now();
    int age = dateNow.getYear()  - dateOfBirth.getYear();
    int currentDay = dateNow.getDayOfMonth();
    int dayOfBirthday = dateOfBirth.getDayOfMonth();
    int currentMonth = dateNow.getMonthValue();
    int monthOfBirthday = dateOfBirth.getMonthValue();
    if(currentDay >= dayOfBirthday && currentMonth >= monthOfBirthday) {
      return age;
    } else return age -1;
  }

  public static int getWeekOfYear(LocalDate dateOfBirth) {
    int week = dateOfBirth.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
    return week;
  }

  public static String getDayOfBirth()
}
