package Lesson3.Exercise3;

public class TicketSeller extends EmployeeBase {

    public TicketSeller(String name, String surname, int employmentYear, int salary){
        super(name, surname, employmentYear, salary);
    }
    public TicketSeller(String name, String surname, int employmentYear){super(name, surname, employmentYear);}

    @Override
    public int calcutareMonthlySalary() {
        return getSalary();
    }
}
