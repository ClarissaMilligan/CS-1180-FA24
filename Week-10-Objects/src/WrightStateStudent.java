public class WrightStateStudent
{
    private String name = "";
    private int age = 0;
    private String UID = "";
    private double GPA = 0.0;
    private boolean isAlumni = false;

    public WrightStateStudent()
    {
        name = "John Doe";
        age = 18;
        UID = "U00000000";
        GPA = 0.0;
        isAlumni = false;
    }

    public WrightStateStudent(String name, int age, String UID, double GPA, boolean isAlumni)
    {
        this.name = name;
        setAge(age);
        this.UID = UID;
        setGPA(GPA);
        this.isAlumni = isAlumni;
    }

    public void setGPA(double newGPA)
    {
        if (newGPA < 0.0)
        {
            GPA = 0.0;
        }
        else if (newGPA > 4.0)
        {
            GPA = 4.0;
        }
        else
        {
            GPA = newGPA;
        }
    }

    public void setAge(int newAge)
    {
        if (newAge < 17)
        {
            age = 17;
        }
        else
        {
            age = newAge;
        }
    }

    public int getAge()
    {
        return age;
    }


    public String getName()
    {
        return name;
    }

    public boolean canGraduate()
    {
        if (GPA >= 2.5)
        {
            isAlumni = true;
        }
        else
        {
            isAlumni = false;
        }
        return isAlumni;
    }

}
