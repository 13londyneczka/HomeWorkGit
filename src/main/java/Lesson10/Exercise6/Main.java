package Lesson10.Exercise6;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args){
    System.out.println(BirthDate.getAge(LocalDate.parse("1997-09-11")));
    System.out.println(BirthDate.getDayOfBirth(LocalDate.parse("1992-08-19")));
    System.out.println(BirthDate.getDayOfYear(LocalDate.parse("1995-03-02")));
  }
}
