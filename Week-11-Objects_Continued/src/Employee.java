import java.util.ArrayList;

public class Employee
{
    private boolean isEmployed = true;
    private String name = "";
    private int age = 0;
    private ArrayList<String> possibleDepartments = new ArrayList<>();
    private String department = "";
    private int employeeID = 0;
    private double hourlyRate = 20.0;

    public Employee ()
    {
        name = "Unknown";
        isEmployed = true;
        age = 18;
        possibleDepartments.add("Finance");
        possibleDepartments.add("Software Development");
        possibleDepartments.add("Graphic Design");
        possibleDepartments.add("Management");
        department = null;
    }

    public Employee (boolean currentlyEmployed, String employeeName, int age, String currentDepartment)
    {
        possibleDepartments.add("Finance");
        possibleDepartments.add("Software Development");
        possibleDepartments.add("Graphic Design");
        possibleDepartments.add("Management");

        isEmployed = currentlyEmployed;
        name = employeeName;
        setDepartment(currentDepartment);
        this.age = age;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public boolean isEmployed()
    {
        return isEmployed;
    }

    public void setEmployed(boolean employed)
    {
        isEmployed = employed;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getDepartment()
    {
        return department;
    }

    public boolean setDepartment(String currDepartment)
    {
        if (possibleDepartments.contains(currDepartment))
        {
            department = currDepartment;
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        String employeeString = "Employee: " + name + " (" + age + ")";
        if (isEmployed)
        {
            return employeeString + " currently works in the " + department + " department.";
        }
        else
        {
            return employeeString + " is not currently employed.";
        }
    }


    public boolean equals(Employee a)
    {
        if (this.getEmployeeID() == a.getEmployeeID() && this.isEmployed() == a.isEmployed())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
