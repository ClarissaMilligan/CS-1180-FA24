import java.util.Scanner;

public class LoopPractice
{
    public static void main(String[] args)
    {
        boolean continueLooping = true;
        Scanner scnr = new Scanner(System.in);

        do
        {
            if (scnr.hasNextInt())
            {
                System.out.println(scnr.nextInt());
            }
            else if (scnr.next().equalsIgnoreCase("exit"))
            {
                continueLooping = false;
            }
            else
            {
                System.out.println("improper input");
            }
        } while (continueLooping);

        for (int countdown = 10; continueLooping && (countdown > 4);)
        {
            System.out.println(countdown);

            String input = scnr.next();
            if (input.equalsIgnoreCase("q"))
            {
                continueLooping = false;
            }
            else if (input.equalsIgnoreCase("d"))
            {
                countdown--;
            }
        }
    }
}
