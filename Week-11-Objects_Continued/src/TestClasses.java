public class TestClasses
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(false, "Tom", 35, "Finance");
        System.out.println(e1);
        Employee e2 = new Employee(false, "Tom", 35, "Finance");
        System.out.println(e2);

        System.out.println(e1.equals(e2));


//        Country c1 = new Country();
//        System.out.println(c1.setLocation("blah"));
//        System.out.println(c1.getLocation());
//        System.out.println(c1.setLocation("africa"));
//        System.out.println(c1.getLocation());


//        Company myCo = new Company();
//
//        myCo.setCompanyType("tech");
//        System.out.println(myCo.getCompanyType());
    }
}
