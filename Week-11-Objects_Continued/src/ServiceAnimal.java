import java.util.ArrayList;

public class ServiceAnimal extends Pet
{
    private int yearsOfService = 0;
    private boolean currentlyWorking = true;
    private String typeOfService = "therapy";
    private ArrayList<String> serviceTypes = new ArrayList<>();

    public ServiceAnimal(int serviceAnimalAge, String species, String gender, String serviceAnimalColor, String name, int yearsOfService, String typeOfService)
    {
        super(serviceAnimalAge, species, gender, serviceAnimalColor, name);

        serviceTypes.add("therapy");
        serviceTypes.add("emotional support animal");
        serviceTypes.add("medical alert");
        serviceTypes.add("arson sniffer");
        serviceTypes.add("bomb sniffer");
        serviceTypes.add("guide animal");
        serviceTypes.add("guard animal");

        setYearsOfService(yearsOfService);
        setTypeOfService(typeOfService);
    }

    public int getYearsOfService()
    {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService)
    {
        if (super.getAge() >= yearsOfService)
        {
            this.yearsOfService = yearsOfService;
        }
    }

    public boolean isCurrentlyWorking()
    {
        return currentlyWorking;
    }

    public void setCurrentlyWorking(boolean currentlyWorking)
    {
        this.currentlyWorking = currentlyWorking;
    }

    public String getTypeOfService()
    {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService)
    {
        if (serviceTypes.contains(typeOfService))
        {
            if (yearsOfService > 2 && typeOfService.equals("medical alert"))
            {
                this.typeOfService = typeOfService;
            }
        }
    }
}
