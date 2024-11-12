import java.util.ArrayList;

public class Company
{
    private int numOfEmployees = 0;
    private double profits = 0.0;
    private boolean isPublic = false;
    private double stockPrice = 0.0;
    private ArrayList<String> products = new ArrayList<>();
    private String name = "";
    private String companyType = "";
    private ArrayList<String> possibleCompanyTypes = new ArrayList<>();

    public Company()
    {
        possibleCompanyTypes.add("Pharma");
        possibleCompanyTypes.add("Tech");
        possibleCompanyTypes.add("Manufacturing");
        possibleCompanyTypes.add("Insurance");
    }

    public Company(int numOfEmployees, double companyProfits, boolean isPublic, double stockPrice, String companyProduct, String companyName, String companyType)
    {
        this();
        setNumOfEmployees(numOfEmployees);
        setProfits(companyProfits);
        setPublic(isPublic);
        setStockPrice(stockPrice);
        addProduct(companyProduct);
        setName(companyName);
        setCompanyType(companyType);
    }

    public Company(int numOfEmployees, double companyProfits, boolean isPublic, double stockPrice, ArrayList<String> products, String companyName, String companyType)
    {
        this();
        setNumOfEmployees(numOfEmployees);
        setProfits(companyProfits);
        setPublic(isPublic);
        setStockPrice(stockPrice);
        addProducts(products);
        setName(companyName);
        setCompanyType(companyType);
    }

    public int getNumOfEmployees()
    {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees)
    {
        if (numOfEmployees > 0)
        {
            this.numOfEmployees = numOfEmployees;
        }
    }

    public double getProfits()
    {
        return profits;
    }

    public void setProfits(double profits)
    {
        this.profits = profits;
    }

    public boolean isPublic()
    {
        return isPublic;
    }

    public void setPublic(boolean aPublic)
    {
        isPublic = aPublic;
    }

    public double getStockPrice()
    {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice)
    {
        if (stockPrice > 0 && isPublic())
        {
            this.stockPrice = stockPrice;
        }
    }

    public ArrayList<String> getProduct()
    {
        return products;
    }

    public void addProduct(String product)
    {
        if (product.length() > 1)
        {
            products.add(product);
        }
    }

    public void addProducts(ArrayList<String> products)
    {
        for (int i = 0; i < products.size(); i++)
        {
            addProduct(products.get(i));
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCompanyType()
    {
        return companyType;
    }

    public void setCompanyType(String companyType)
    {
        for (String s : possibleCompanyTypes)
        {
            if (s.equalsIgnoreCase(companyType))
            {
                this.companyType = s;
            }
        }
    }

    public ArrayList<String> getPossibleCompanyTypes()
    {
        return possibleCompanyTypes;
    }
}
