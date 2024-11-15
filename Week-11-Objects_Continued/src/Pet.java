import java.util.ArrayList;

public class Pet
{
    private int age = 0;
    private String species = null;
    private String gender = null;
    private String color = null;
    private String name = null;
    private static ArrayList<String> possibleSpecies = new ArrayList<>();

    public Pet()
    {
        possibleSpecies.add("dog");
        possibleSpecies.add("cat");
        possibleSpecies.add("fish");
        possibleSpecies.add("turtle");
        possibleSpecies.add("hampter");
    }

    public Pet(int petAge, String species, String gender, String petColor, String name)
    {
        this();

        age = petAge;
        setSpecies(species);
        this.gender = gender;
        color = petColor;
        this.name = name;
    }

    public void happyBirthday()
    {
        age++;
    }

    public String getSpecies()
    {
        return species;
    }

    public boolean setSpecies(String petSpecies)
    {
        petSpecies = petSpecies.toLowerCase();
        if (possibleSpecies.contains(petSpecies))
        {
            species = petSpecies;
        }
        return possibleSpecies.contains(petSpecies);
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age > 0)
        {
            this.age = age;
        }
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        String petString = "Pet " + name + " is a " + gender + " ";
        if (species == null)
        {
            petString = petString + "without a valid species defined";
        }
        else
        {
            petString = petString + species;
        }
        petString = petString + " that is " + color + " and " + age + " years old.";
        return petString;
    }

    @Override
    public boolean equals(Object p)
    {
        if (p instanceof Pet)
        {
            Pet peeet = (Pet) p;

            if (this.getName().equals(peeet.getName()) && this.getAge() == peeet.getAge() && this.getColor().equals(peeet.getColor()) && this.getGender().equals(peeet.getGender()) && this.getSpecies().equals(peeet.getSpecies()))
            {
                return true;
            }
        }
        return false;
    }
}
