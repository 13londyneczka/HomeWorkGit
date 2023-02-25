package Lesson5.Exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


class EmployeeTest {

    @Test
    void shouldGetEmployeeDescriptionNameAndSurname() {
        Employee employee = new Employee("Jan", "Kowalski");
        String actualEmployeeDescription = employee.getEmployeeDescription();

        Assertions.assertNotNull(actualEmployeeDescription);
        Assertions.assertEquals("Employee: Jan Kowalski", actualEmployeeDescription);

    }

    @Test
    void shouldGetEmployeeTotalInfo() {
        Employee employee = new Employee("Jan", "Kowalski", 38);
        String actualEmployeeTotalInfo = employee.getEmployeeTotalInfo();

        Assertions.assertNotNull(actualEmployeeTotalInfo);
        Assertions.assertEquals("Employee name : Jan Kowalski", actualEmployeeTotalInfo);
    }

    @Test
    void shouldGetEmployeeOnlyBaseSalary() {
        BigDecimal baseSalary = new BigDecimal(5000);
        Employee employee = new Employee("Jan", "Kowalski", 38, baseSalary);
        BigDecimal actualBaseSalary = employee.getBaseSalary();

        Assertions.assertNotNull(actualBaseSalary);
        Assertions.assertEquals(baseSalary, actualBaseSalary);
    }

    @Test
    void shouldGetTotalSalaryWithBonus() {
        BigDecimal baseSalary = new BigDecimal(5000);
        BigDecimal bonus = new BigDecimal(800);
        Employee employee = new Employee("Jan", "Kowalski", 38,baseSalary,bonus);
        BigDecimal actualTotalSalary = employee.getTotalSalary();

        Assertions.assertNotNull(actualTotalSalary);
        Assertions.assertEquals(baseSalary.add(bonus), actualTotalSalary);
    }

    @Test
    void shouldGetOnlyBonus() {
        BigDecimal baseSalary = new BigDecimal(5000);
        BigDecimal bonus = new BigDecimal(800);
        Employee employee = new Employee("Jan", "Kowalski", 38, baseSalary, bonus);
        BigDecimal actualBonus = employee.getBonus();

        Assertions.assertNotNull(actualBonus);
        Assertions.assertEquals(bonus, actualBonus);
    }
}