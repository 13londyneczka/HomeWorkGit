package Lesson7.Exercise8;

public class SalaryCalculator {

  private WeekendWorkProvider weekendWorkProvider;

  private WorkDayProvider workDayProvider;

  public SalaryCalculator(WeekendWorkProvider weekendWorkProvider, WorkDayProvider workDayProvider) {
    this.weekendWorkProvider = weekendWorkProvider;
    this.workDayProvider = workDayProvider;
  }

  public double getSalary(int workedDaysAmount, int weekendWorkedDays, double extraBonus) {
    return workDayProvider.getSalary(workedDaysAmount) + weekendWorkProvider.getWeekendSalary(weekendWorkedDays) + extraBonus;
  }
}
