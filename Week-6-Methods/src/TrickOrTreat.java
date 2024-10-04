import java.util.Random;
import java.util.Scanner;

public class TrickOrTreat
{
    public static void main(String[] args)
    {
        // set up scanner and initialize variables
        Scanner scnr = new Scanner(System.in);

        int numHouses = 0;
        boolean badNumInput = true;
        boolean badTreatInput = true;
        boolean isTreat = false;
        String input = "";

        // loops while the user continues to give non-integer input
        while (badNumInput)
        {
            // prompt for number of houses
            System.out.print("How many houses do you plan on visiting? ");

            // if they give us an integer, save the value and exit the loop by setting badNumInput to false
            if (scnr.hasNextInt())
            {
                numHouses = scnr.nextInt();
                badNumInput = false;
            }
            // otherwise, tell them they give us improper input and clear the scanner
            else
            {
                System.out.println("Sorry! That is not valid input. Please try again!");
                scnr.next();
            }
        }

        // loop for the number of houses they chose to visit
        for (int i = 0; i < numHouses; i++)
        {
            // loop to reprompt the user if they don't give us correct input
            while (badTreatInput)
            {
                // prompt the user for a trick or treat
                System.out.print("Trick or Treat!? ");
                input = scnr.next();

                // if it is 'trick',
                // exit the loop via setting badTreatInput to false
                // toggle the isTreat flag to false
                if (input.equalsIgnoreCase("Trick"))
                {
                    badTreatInput = false;
                    isTreat = false;
                }
                // if it is 'treat',
                // exit the loop via setting badTreatInput to false
                // toggle the isTreat flag to true
                else if (input.equalsIgnoreCase("Treat"))
                {
                    badTreatInput = false;
                    isTreat = true;
                }
                // reprompt the user and stay in the loop if they give any other input
                else
                {
                    System.out.println("Sorry! That is not valid input. Please try again!");
                }
            }
            // print out the result of the trickOrTreat method, after giving it the flag for treat
            System.out.println(trickOrTreat(isTreat));
            // reset badTreatInput to true so we re-enter the loop to check the input the next time around
            badTreatInput = true;
        }
    }

    // method takes in a boolean indicating whether the user selected a treat or not
    // returns a random string message based on their input
    public static String trickOrTreat(boolean isTreat)
    {
        // set up a random object (this is only accessible from within the scope of this method
        Random rng = new Random();

        // generate a random number from 0, 1, or 2
        int num = rng.nextInt(3);
        String message = "You got a ";

        // if the user selected a treat
        if (isTreat)
        {
            // switch takes in the random number and selects a message based off of it
            switch (num)
            {
                case 0:
                    message = message + "Kit-Kat!";
                    break;
                case 1:
                    message = message + "Hershey Bar!";
                    break;
                default:
                    message = message + "Snickers!";
                    break;
            }
        }
        // if the user selected a trick
        else
        {
            // switch takes in the random number and selects a message based off of it
            switch (num)
            {
                case 0:
                    message = message + "snake!";
                    break;
                case 1:
                    message = message + "tarantula!";
                    break;
                default:
                    message = message + "bat!";
                    break;
            }

        }
        // return the message
        return message;
    }
}
