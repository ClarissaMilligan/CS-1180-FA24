import java.util.Scanner;
import java.util.Random;

public class ConditionalGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int score = 0;

        // #1
        System.out.println("Enter an even number: ");
        int userNum = keyboard.nextInt();

        // modulus operation tells us the remainder of the division
        // if the remainder is 0 when we divide by 2, we know the number is even
        if (userNum % 2 == 0)
        {
            System.out.println("That is an even number!");
            score = score + 1;
        }

        // #2
        System.out.println("Enter a decimal number between 0.5 and 5.5");
        double userDec = keyboard.nextDouble();

        // can't do 0.5 < userDec < 5.5
        // we have to type each conditional statement separately
        if ((userDec > 0.5) && (userDec < 5.5))
        {
            System.out.println("That decimal value is between 0.5 and 5.5!");
            // score++ is a more efficient way of writing score = score + 1;
            score++;
        }

        // #3
        System.out.println("Give me a word that has the word cat in it: ");
        String userWord = keyboard.next();

        // if the word contains 'cat' and is at least 4 characters long, then we know the word can't just be 'cat'
        if (userWord.contains("cat") && userWord.length() > 3)
        {
            System.out.println("Your word contains cat!");
            score++;
        }

        // #4
        System.out.println("Type a word that is " + userNum + " characters long.");
        String userWord2 = keyboard.next();

        if (userWord2.length() == userNum)
        {
            System.out.println("That word was the correct length!");
            score++;
        }

        // #5
        // Random class is used to create a Random object
        Random randomNumGenerator = new Random();
        // generates a random integer with a bound of 10
        int randomInt = randomNumGenerator.nextInt(10);

        System.out.println("Repeat the following number: " + randomInt);
        int userRepeat = keyboard.nextInt();

        if (userRepeat == randomInt)
        {
            System.out.println("You repeated the number correctly!");
            score++;
        }

        // #6
        System.out.println("Your score is: " + score);

        // #7
        System.out.println("Say 'bye'");
        String userBye = keyboard.next();

        // we can't use == or != with Strings because they are not a primitive datatype
        // the == sign will not check if the two values are equal but will instead check
        // if they have the same location in memory
        if (userBye.equalsIgnoreCase("bye"))
        {
            System.out.println("Goodbye!");
        }
        else
        {
            System.out.println(">:(");
        }
    }
}
