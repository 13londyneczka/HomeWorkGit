package Lesson7.Exercise5;

import java.time.Month;

public enum Season {
  WINTER,
  SPRING,
  SUMMER,
  AUTUMN;

  public static Season of(Month month) {
    return switch (month) {
      case JANUARY, FEBRUARY, DECEMBER -> Season.WINTER;
      case MARCH, APRIL, MAY -> Season.SPRING;
      case JUNE, JULY, AUGUST -> Season.SUMMER;
      case SEPTEMBER, OCTOBER, NOVEMBER -> Season.AUTUMN;
    };
  }
}