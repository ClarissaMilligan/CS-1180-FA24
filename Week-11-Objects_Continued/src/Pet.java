import java.util.ArrayList;

public class Pet
{
    private int age = 0;
    private String breed = null;
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

    public Pet(int petAge, String petBreed, String species, String gender, String petColor, String name)
    {
        possibleSpecies.add("dog");
        possibleSpecies.add("cat");
        possibleSpecies.add("fish");
        possibleSpecies.add("turtle");
        possibleSpecies.add("hampter");

        age = petAge;
        breed = petBreed;
        setSpecies(species);
        this.gender = gender;
        color = petColor;
        this.name = name;
    }

    public void happyBirthday()
    {
        age++;
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

}
