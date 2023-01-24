package Lesson3.Exercise3;

public class Menager extends EmployeeBase{
    private static final int BASE_SALARY = 5000;
    private static final int BASE_BONUS = 500;
    private int bonus;

    public Menager(String name, String surname, int employmentYear, int salary){
        super(name, surname, employmentYear, salary);
        this.bonus = BASE_BONUS;
    }
    public Menager(String name, String surname, int employmentYear){
        super(name, surname,employmentYear, BASE_SALARY);
        this.bonus = BASE_BONUS;
    }

    @Override
    public int calcutareMonthlySalary() {
        return this.getSalary() + bonus;}
    public void setBonus(int bonus){this.bonus = bonus;}
}
