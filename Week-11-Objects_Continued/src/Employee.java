import java.util.ArrayList;

public class Employee
{
    private boolean isEmployed = true;
    private String name = "";
    private int age = 0;
    private ArrayList<String> possibleDepartments = new ArrayList<>();
    private String department = "";

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
}
