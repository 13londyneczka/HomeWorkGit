package Lesson7.Exercise8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SalaryCalculatorTest {

  @Test
  void shouldCalculateFullSalary() {
    WorkDayProvider workDayProviderMock = Mockito.mock(WorkDayProvider.class);
    Mockito.when(workDayProviderMock.getSalary(21)).thenReturn(4200d);

    WeekendWorkProvider weekendWorkProviderMock = Mockito.mock(WeekendWorkProvider.class);
    Mockito.when(weekendWorkProviderMock.getWeekendSalary(2)).thenReturn(600d);

    SalaryCalculator salaryCalculator = new SalaryCalculator(weekendWorkProviderMock, workDayProviderMock);

    double totalSalary = salaryCalculator.getSalary(21, 2, 400);
    assertEquals(5200, totalSalary);
  }
}