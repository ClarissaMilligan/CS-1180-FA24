import java.util.Random;
import java.util.Scanner;

public class HigherLowerLetters
{
    public static void main(String[] args)
    {
        // create Random and Scanner objects
        Random rng = new Random();
        Scanner scan = new Scanner(System.in);

        // initialize variables
        // note in this case, we initialize score to 3
        int randInt = 0;
        char randChar = 'a';
        char guess = 'a';
        boolean isGuessCorrect = false;
        int score = 3;

        // 97 - 122
        // every character in Java has a corresponding numeric value
        // for example a lower case 'a' has the value 97 and the values
        // increment by one as you move through the alphabet so that
        // 'z' has a value of 122

        // generate a random integer in a range of 26 numbers, starting at 97
        randInt = rng.nextInt(26) + 97;
        // convert the integer into its corresponding character
        randChar = (char) randInt;
        // The following line can be put in if you want to know what letter
        // is trying to be guessed
        //System.out.println(randChar);

        // retrieve the user's guess
        System.out.println("Guess your letter");
        // convert the user's guess to all lowercase so that it does not matter
        // if the user typed in a capital or lowercase letter
        // then take the character that occurs at index 0 and store it in the
        // character variable
        // remember there is no .nextChar() method
        guess = scan.next().toLowerCase().charAt(0);

        // verify that the user's guess is within the alphabetic range
        if (!(guess <= 122 && guess >= 97))
        {
            // if it's not, notify the user, and end the program
            System.out.println("That's not a alphabetic character");
            System.exit(1);
        }

        // check if the user guessed the right character
        if (randChar == guess)
        {
            // if they did, they win and their guess is correct
            System.out.println("You win!!!");
            isGuessCorrect = true;
            // they will receive a score of 3 (default value of score)
            System.out.println("Points: " + score);
        }
        // if the guess has a greater numeric value than the random character
        // then tell them to guess an earlier character in the alphabet
        else if (randChar < guess)
        {
            System.out.println("Guess earlier in the alphabet");
        }
        // if the guess has a smaller numeric value than the random character
        // then tell them to guess a later character in the alphabet
        else
        {
            System.out.println("Guess later in the alphabet");
        }

        // if the user has not guessed correctly so far
        if (!isGuessCorrect)
        {
            // prompt the user for another guess
            System.out.println("Guess again!");
            guess = scan.next().toLowerCase().charAt(0);

            // the following code follows the same logic as above
            if (randChar == guess)
            {
                System.out.println("You win!!!");
                isGuessCorrect = true;
                // subtract one from the score since the user has already made
                // one incorrect guess
                System.out.println("Points: " + (score - 1));
            }
            else if (randChar < guess)
            {
                System.out.println("Guess earlier in the alphabet");
            }
            else
            {
                System.out.println("Guess later in the alphabet");
            }
        }

        // the following logic is the same as the second guess logic
        if (!isGuessCorrect)
        {
            System.out.println("Guess again!");
            guess = scan.next().toLowerCase().charAt(0);

            if (randChar == guess)
            {
                System.out.println("You win!!!");
                isGuessCorrect = true;
                // subtract two from the score since the user has now guessed
                // incorrectly twice
                System.out.println("Points: " + (score - 2));
            }
            else if (randChar < guess)
            {
                System.out.println("Guess earlier in the alphabet");
            }
            else
            {
                System.out.println("Guess later in the alphabet");
            }
        }

        // if the user still hasn't guessed the correct character
        // then give them a very low score and tell them the correct character
        if (!isGuessCorrect)
        {
            System.out.println("You suck!");
            System.out.println("Points: " + -9999);
            System.out.println("The correct answer was " + randChar);
        }
    }
}
