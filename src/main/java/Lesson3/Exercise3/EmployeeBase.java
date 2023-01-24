package Lesson3.Exercise3;

public abstract class EmployeeBase {

    private static final int Base_Salary = 3000;

    private final String name;

    private final String surname;

    private final int employmentYear;

    private final int salary;

    public EmployeeBase(String name, String surname, int employmentYear, int salary){
        this.name = name;
        this.surname = surname;
        this.employmentYear = employmentYear;
        this.salary = salary;
    }

    public EmployeeBase(String name, String surname, int employmentYear){
        this.name = name;
        this.surname = surname;
        this.employmentYear = employmentYear;
        this.salary = Base_Salary;
    }
    public int getWorkYears(){
        return 2022-employmentYear;
    }
    public int getSalary(){
        return this.salary;
    }
    public abstract int calcutareMonthlySalary();
}
