public class TestClasses
{
    public static void main(String[] args)
    {
        Country c1 = new Country();
        System.out.println(c1.setLocation("blah"));
        System.out.println(c1.getLocation());
        System.out.println(c1.setLocation("africa"));
        System.out.println(c1.getLocation());


//        Company myCo = new Company();
//
//        myCo.setCompanyType("tech");
//        System.out.println(myCo.getCompanyType());
    }
}
