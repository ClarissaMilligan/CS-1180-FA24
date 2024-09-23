import java.util.Scanner;

public class UserInputLoopSec4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // continues to loop essentially forever, while the user passes in input
        while (keyboard.hasNext())
        {
            // checks if the user provided us with an integer
            if (keyboard.hasNextInt())
            {
                // grabs the integer that the user typed
                // remember all the hasNext() variations do not actually get the input from the user
                // they just verify if there is input
                int num = keyboard.nextInt();
                System.out.println(num);
            }
            // otherwise, we do nothing and wait for the next input
            else
            {
                // again, since the input has not been grabbed from the scanner yet,
                // we need to call next() to advance the scanner so it is ready for new input
                keyboard.next();
            }
        }
    }
}
