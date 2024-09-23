import java.util.Scanner;

public class UserInputLoopSec3
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        // loops while there is input (essentially forever)
        while (scnr.hasNext())
        {
            // checks if the input is an integer
            if (scnr.hasNextInt())
            {
                // tells the user that they entered an integer
                System.out.println("You entered an integer");
                // in order to move on to the next value that the user will enter, we need to call next()
                // this clears the input from the scanner
                // remember the hasNext() variations do not actually grab the user input
                scnr.next();
            }
            // checks if the user input a double
            else if (scnr.hasNextDouble())
            {
                // tells the user that they input a decimal
                System.out.println("You entered a decimal value");
                // clears the users input from the scanner
                scnr.next();
            }
            // catches other cases
            else
            {
                // assume they input a String
                System.out.println("You entered a String");
                scnr.next();
            }
//            String userNum = scnr.next();
//            System.out.println(userNum);
        }
    }
}
