import java.util.Random;
import java.util.Scanner;

public class HigherLower
{
    public static void main(String[] args)
    {
        // initiliaze variables
        boolean guessAgain = true;
        int score = 0;
        int randomNumber = 0;

        // set up a Random and Scanner object
        Random rng = new Random();
        Scanner keyboard = new Scanner(System.in);

        // Allow the user to specify an upper bound for the random number generation
        System.out.println("Tell me the upper bound for the random number: ");
        int upperBound = keyboard.nextInt();

        // Allow the user to specify a lower bound for the random number generation
        System.out.println("Tell me the lower bound for the random number");
        int lowerBound = keyboard.nextInt();

        // verify that the lowerBound is in fact smaller than the upperBound
        // before assigning the bounds
        if (lowerBound < upperBound)
        {
            // we do upper - lower to obtain the total range of possible numbers we want to generate
            // we add one to ensure that it is inclusive
            // the lower bound is added after the method call to offset our starting position appropriately
            randomNumber = rng.nextInt((upperBound - lowerBound) + 1) + lowerBound;
        }
        else
        {
            // if our bounds don't make sense, we could switch them so they do make sense
            // i.e. the upperBound becomes the lower and vice versa
            System.out.println("Lower bound cannot be greater than upper bound");
            System.out.println("Switching bounds");
            // implement the switch of the upper and lower bound
            randomNumber = rng.nextInt((lowerBound - upperBound) + 1) + upperBound;

            // we could also handle this case by simply exiting the program
//            System.out.println("Lower bound cannot be greater than upper bound");
//            System.exit(1);
        }

        // prompt the user for their guess
        System.out.println("Guess a number");
        int userGuess = keyboard.nextInt();

        // if their guess is correct, they win!
        if (userGuess == randomNumber)
        {
            // guessAgain gets set to false because they have already
            // guessed the correct number
            // award a score of 3
            System.out.println("You win!");
            guessAgain = false;
            score = 3;
        }
        // if their guess is smaller than the random number
        // tell them to guess a bigger number
        else if (userGuess < randomNumber)
        {
            // guessAgain is set to true because the user gets another guess
            // this is redundant since guessAgain's default value is true
            System.out.println("Higher");
            guessAgain = true;
        }
        // if their guess is bigger than the random number
        // tell them to guess a smaller number
        // in this case we could also use an else statement since we have
        // already checked if the numbers are equal or if the userGuess is
        // smaller, so the only option left is for userGuess to be bigger.
        // however, it also doesn't hurt to be specific
        else if (userGuess > randomNumber)
        {
            // guessAgain is set to true because the user gets another guess
            // this is redundant since guessAgain's default value is true
            System.out.println("Lower");
            guessAgain = true;
        }

        // check that the user needs to guess again
        // since guessAgain is a boolean, we don't actually have to type
        // out 'guessAgain == true' instead we can just look at the value
        // of guessAgain itself
        if (guessAgain)
        {
            // get the next guess from the user
            System.out.println("Make another guess");
            userGuess = keyboard.nextInt();

            // next portion of code follows same logic as above
            if (userGuess == randomNumber)
            {
                // award a score of two
                System.out.println("You win!");
                guessAgain = false;
                score = 2;
            }
            else if (userGuess < randomNumber)
            {
                System.out.println("Higher");
                guessAgain = true;
            }
            else if (userGuess > randomNumber)
            {
                System.out.println("Lower");
                guessAgain = true;
            }
        }

        // code for 3rd and final guess follows the same logic as 2nd guess
        if (guessAgain)
        {
            System.out.println("Make another guess");
            userGuess = keyboard.nextInt();

            if (userGuess == randomNumber)
            {
                // award a score of one
                System.out.println("You win!");
                guessAgain = false;
                score = 1;
            }
            else if (userGuess < randomNumber)
            {
                System.out.println("Higher");
                guessAgain = true;
            }
            else if (userGuess > randomNumber)
            {
                System.out.println("Lower");
                guessAgain = true;
            }
        }

        // if the user still has not guessed the correct number
        // (i.e. guessAgain is still true)
        // Tell them they lost and tell them the correct value.
        if (guessAgain)
        {
            System.out.println("You lose!");
            System.out.println("Correct number was: " + randomNumber);
        }

        // print the user's score
        // since score is defaulted to 0, we don't need to update this
        // value unless the user guesses correctly.
        System.out.println("Your score is: " + score);
    }
}
