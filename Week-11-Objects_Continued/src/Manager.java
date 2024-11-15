import java.util.ArrayList;

public class Manager extends Employee
{
    private final double MIN_SALARY = 70000;
    private final double MAX_SALARY = 120000;
    private boolean salaried = true;
    private double salary = MIN_SALARY;
    private ArrayList<Employee> subordinates = new ArrayList<>();

    public Manager(double salary)
    {
        setSalary(salary);
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        if (salary >= MIN_SALARY && salary <= MAX_SALARY)
        {
            this.salary = salary;
        }
    }

    public double giveRaise(Employee e, double raiseAmt)
    {
        if (subordinates.contains(e))
        {
            e.setHourlyRate(e.getHourlyRate() + raiseAmt);
            return e.getHourlyRate();
        }
        return -1;
    }

}
