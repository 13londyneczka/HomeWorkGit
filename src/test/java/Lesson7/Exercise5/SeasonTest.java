package Lesson7.Exercise5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


class SeasonTest {

  @ParameterizedTest
  @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
  void shouldGetSeasonWinter(Month month) {
    assertEquals(Season.WINTER, Season.of(month));
  }

  @ParameterizedTest
  @EnumSource(value = Month.class, names = {"MARCH", "APRIL", "MAY"})
  void shouldGetSeasonSpring(Month month) {
    assertEquals(Season.SPRING, Season.of(month));
  }

  @ParameterizedTest
  @EnumSource(value = Month.class, names = {"JUNE", "JULY", "AUGUST"})
  void shouldGetSeasonSummer(Month month) {
    assertEquals(Season.SUMMER, Season.of(month));
  }

  @ParameterizedTest
  @EnumSource(value = Month.class, names = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
  void shouldGetSeasonAutumn(Month month) {
    assertEquals(Season.AUTUMN, Season.of(month));
  }

}