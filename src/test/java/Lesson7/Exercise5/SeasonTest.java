package Lesson7.Exercise5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

class SeasonTest {

  @ParameterizedTest
  @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
  void shouldGetSeasonWinter(Month month) {
    assertEquals(Season.WINTER, Season.of(month));
  }

//  void shouldGetSeasonWinter() {
//    Assertions.assertTrue(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY(Season.WINTER));

//  }

//
//  @Test
//  void shouldGetSeasonSpring() {
//    assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.MARCH));
//    assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.APRIL));
//    assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.MAY));
//  }
//
//  @Test
//  void shouldGetSeasonSummer() {
//    assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.JUNE));
//    assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.JULY));
//    assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.AUGUST));
//  }
//
//  @Test
//  void shouldGetSeasonAutumn() {
//    assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.SEPTEMBER));
//    assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.OCTOBER));
//    assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.NOVEMBER));
//  }
//
//  @Test
//  void shouldGetSeasonNullInput() {
//    assertThrows(IllegalArgumentException.class, () -> {
//      SeasonUtils.getSeason(null);
//    });
//  }
}