import java.util.Scanner;

public class UserInputLoop3
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        while (scnr.hasNext())
        {
            if (scnr.hasNextInt())
            {
                System.out.println("You entered an integer");
                scnr.next();
            }
            else if (scnr.hasNextDouble())
            {
                System.out.println("You entered a decimal value");
                scnr.next();
            }
            else
            {
                System.out.println("You entered a String");
                scnr.next();
            }
//            String userNum = scnr.next();
//            System.out.println(userNum);
        }
    }
}
