import java.util.Scanner;

public class UserInputLoopSec2
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        // loop will essentially loop forever, since next can handle any input
        while(scnr.hasNext())
        {
            // this line could still throw an error because we have only checked that there is data input,
            // but have not verified if the user entered an integer
            int num = scnr.nextInt();
            System.out.println(num);

            // repeats what the user typed
            String userInput = scnr.next();
            System.out.println(userInput);
        }

    }
}
