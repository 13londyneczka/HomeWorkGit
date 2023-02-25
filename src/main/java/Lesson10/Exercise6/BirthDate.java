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

  public static int getDayOfYear(LocalDate dateOfBirth) {
    int whichDay = dateOfBirth.get(ChronoField.DAY_OF_YEAR);
    return whichDay;
  }

  public static String getDayOfBirth(LocalDate dateOfBirth) {
    String day = String.valueOf(dateOfBirth.getDayOfWeek());
    return day;
  }
}
