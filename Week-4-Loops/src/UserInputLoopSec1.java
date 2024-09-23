import java.util.Scanner;

public class UserInputLoopSec1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // loops while the user provides integers
        // if the user enters any other data type, the loop exits
        while (scan.hasNextInt())
        {
            // in order to repeat what the user typed, we have to actually grab the input from the user
            // since hasNextInt() does not actually grab the input but only tells us if it exists
            int userNum = scan.nextInt();
            System.out.println(userNum);
        }
    }
}
