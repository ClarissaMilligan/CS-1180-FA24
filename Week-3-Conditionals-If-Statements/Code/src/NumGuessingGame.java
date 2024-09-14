import java.util.Random;
import java.util.Scanner;

public class NumGuessingGame
{
    public static void main(String[] args)
    {
        // initialize variables
        // it's good practice to initialize our variables at the start
        // this way we know they will be accessible
        // and they have a default value to avoid unexpected output
        int playerOneGuess = 0;
        int playerTwoGuess = 0;
        int playerThreeGuess = 0;
        int playerOneComparison = 0;
        int playerTwoComparison = 0;
        int playerThreeComparison = 0;

        // Create a Random object
        Random rand = new Random();
        // Generate a random number from 0-9
        // (10 as the bound is exclusive)
        int randNum = rand.nextInt(10);

        // ask for the number of players as a string
        System.out.println("Two or three players?");
        Scanner scnr = new Scanner(System.in);
        String numPlayers = scnr.next();

        // to check if the string inputted is equivalent to 'two'
        // we can't use the == operator because String is not a primitive type
        if (numPlayers.equalsIgnoreCase("two"))
        {
            // retrieve the guesses from the user
            System.out.println("Player one guess: ");
            playerOneGuess = scnr.nextInt();
            System.out.println("Player two guess: ");
            playerTwoGuess = scnr.nextInt();

            // calculate the distance of each guess from the random number
            // we take the absolute value because we don't care about
            // the direction, only the distance
            playerOneComparison = Math.abs(playerOneGuess - randNum);
            playerTwoComparison = Math.abs(playerTwoGuess - randNum);

            // if player one has a greater distance from the correct number
            // then player two wins
            if (playerOneComparison > playerTwoComparison)
            {
                System.out.println("Player Two Wins!");
            }
            // otherwise if player two has a greater distance
            // then player one wins
            else if (playerOneComparison < playerTwoComparison)
            {
                System.out.println("Player One Wins!");
            }
            // if one is not greater than the other,
            // then they must be equal
            // therefore a tie has occurred
            else
            {
                System.out.println("It's a tie!");
            }
        }
        // if the user chose 3 players
        else if (numPlayers.equalsIgnoreCase("three"))
        {
            // collect all 3 guesses
            System.out.println("Player one guess: ");
            playerOneGuess = scnr.nextInt();
            System.out.println("Player two guess: ");
            playerTwoGuess = scnr.nextInt();
            System.out.println("Player three guess: ");
            playerThreeGuess = scnr.nextInt();

            // calculate distances for each guess
            playerOneComparison = Math.abs(playerOneGuess - randNum);
            playerTwoComparison = Math.abs(playerTwoGuess - randNum);
            playerThreeComparison = Math.abs(playerThreeGuess - randNum);

            // check if player one's distance is the smallest of the three
            // meaning it is the closest to the right number
            if ((playerOneComparison < playerTwoComparison) && (playerOneComparison < playerThreeComparison))
            {
                System.out.println("Player One Won!");
            }
            // check if player two's distance is the smallest of the three
            // meaning it is the closest to the right number
            else if ((playerTwoComparison < playerOneComparison) && (playerTwoComparison < playerThreeComparison))
            {
                System.out.println("Player Two Won!");
            }
            // check if player three's distance is the smallest of the three
            // meaning it is the closest to the right number
            else if ((playerThreeComparison < playerOneComparison) && (playerThreeComparison < playerTwoComparison))
            {
                System.out.println("Player Three Won!");
            }
            // otherwise a tie has occurred
            else
            {
                System.out.println("There's a tie somewhere!");
            }
        }
        // if the user doesn't enter 'two' or 'three'
        // we tell them that is not valid input
        // and then exit the program
        // any non-zero value passed into exit() means an error has occurred
        else
        {
            System.out.println("That's not a valid input!");
            System.exit(1);
        }

        // display the random number
        System.out.println("The random number was " + randNum);

    }
}
