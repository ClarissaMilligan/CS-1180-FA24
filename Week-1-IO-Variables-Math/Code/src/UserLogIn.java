// We have to import the Scanner in order to use it later on
import java.util.Scanner;

public class UserLogIn
{
    public static void main(String[] args)
    {
        // Set up a Scanner object
        Scanner input = new Scanner(System.in);

        // prompt for a username
        System.out.println("What's you username?");
        // we could use .next() here instead but the Scanner would only grab
        // the string until it sees a whitespace. for example, if
        // someone typed their first and last name, it would only
        // retrieve the first name
        String usr = input.nextLine();
        System.out.println("Your username is " + usr);

        // prompt for a pin
        // makes the assumption that the user will only enter integers
        System.out.println("What's your pin?");
        // retrieves an integer value and saves it to an integer variable
        int pin = input.nextInt();
        System.out.println("Your pin is " + pin);

        // prompt for the person's age
        System.out.println("How old are you?");
        int yearsOld = input.nextInt();

        // multiply by 12 to figure out how many months old the person is
        int monthsOld = yearsOld * 12;
        System.out.println("Your age in months is " + monthsOld);

        // uses the modulus operator to determine if the remainder of dividing
        // the user's age in years by two
        int remainder = yearsOld % 2;
        System.out.println("The remainder is " + remainder);

        // uses an if statement to see if the remainder is 0.
        // if it is equal to 0, this tells us that their age
        // is divisible by 2, meaning it is an even number
        if (remainder == 0)
        {
            System.out.println("Your age is an even number.");
        }

        // prompts for the user's favorite decimal number
        System.out.println("What's your favorite decimal number?");
        // retrieves the data and stores it in a double
        double dec = input.nextDouble();
        // rounds the decimal number to the nearest integer.
        // the round method returns a long, so we have to store
        // the result in a long data type.
        // long also holds integer values, but it is capable of
        // holding much larger integers than int
        long rounded = Math.round(dec);
        System.out.println(rounded);
    }
}
