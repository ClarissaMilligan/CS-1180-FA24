import java.util.Scanner;

public class UserInputLoopActivitySolution
{
    public static void main(String[] args)
    {
        // set up variables with initial values
        Scanner keyboard = new Scanner(System.in);
        double sum = 0.0;
        String userInput = "";
        boolean continueRunning = true;

        // enters loop because continueRunning starts as true
        while (continueRunning)
        {
            // verify if what the user entered was a double
            // we use double because it will work for both integer and decimal values
            if (keyboard.hasNextDouble())
            {
                // if they have entered a double, we can go ahead and add it to our sum
                // remember that hasNextDouble() does not actually grab the input, so we must use nextDouble() here
                sum = sum + keyboard.nextDouble();
            }
            // else, we check if the user gave us a String
            // this else if could be replaced with just an else statement since if they don't give us a double,
            // we don't want to add it to the sum
            else if(keyboard.hasNext())
            {
                // again since hasNext() does not grab the input, we need to call hasNext()
                userInput = keyboard.next();

                // then we can check if the input is equivalent to the String "done"
                // we ignore case to make our program more user-friendly
                if (userInput.equalsIgnoreCase("done"))
                {
                    // if they have typed "done", we update our boolean to false, so the loop will be exited
                    continueRunning = false;
                }
                else
                {
                    // otherwise, we print to the user to try again since their input is not what we were expecting
                    System.out.println("Please try again");
                }
            }
        }
        // at the very end we display the sum to the users
        System.out.println("Your sum is: " + sum);
    }
}
