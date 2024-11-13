import java.util.ArrayList;

public class Country
{
    private String location = "";
    private int population = 0;
    private String name = "";
    private boolean internationallyRecognized = true;
    private double size = 0.0;
    private ArrayList<String> continents = new ArrayList<>();

    public Country()
    {
        continents.add("North America");
        continents.add("South America");
        continents.add("Europe");
        continents.add("Africa");
        continents.add("Asia");
        continents.add("Australia");
        continents.add("Antarctica");
    }

    public Country(String location, int pop, String name, boolean iR, double size)
    {
        this();
        setLocation(location);
        setPopulation(pop);
        this.name = name;
        internationallyRecognized = iR;
        setSize(size);
    }

    public String getLocation()
    {
        return location;
    }

    public boolean setLocation(String location)
    {
        for (int i = 0; i < continents.size(); i++)
        {
            if (continents.get(i).equalsIgnoreCase(location))
            {
                this.location = continents.get(i);
                return true;
            }
        }
        return false;
    }

    public int getPopulation()
    {
        return population;
    }

    public boolean setPopulation(int population)
    {
        if (population > 0)
        {
            this.population = population;
            return true;
        }
        return false;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isInternationallyRecognized()
    {
        return internationallyRecognized;
    }

    public void setInternationallyRecognized(boolean internationallyRecognized)
    {
        this.internationallyRecognized = internationallyRecognized;
    }

    public double getSize()
    {
        return size;
    }

    public void setSize(double size)
    {
        if (size > 0.0)
        {
            this.size = size;
        }
    }
}
