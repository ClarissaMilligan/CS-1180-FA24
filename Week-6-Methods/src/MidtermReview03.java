import java.util.Scanner;

public class MidtermReview03
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        boolean dontStop = true;
        int bobAge = 26;

        while (dontStop)
        {
            System.out.print("How old are you? ");

            if (scnr.hasNextInt())
            {
                int userAge = scnr.nextInt();
                int diff = userAge - bobAge;

                if (diff > 0)
                {
                    System.out.println("You are " + diff + " years older than Bob.");
                }
                else if (diff == 0)
                {
                    System.out.println("You are the same age as Bob!");
                }
                else
                {
                    System.out.println("You are " + Math.abs(diff) + " years younger than Bob.");
                }
                scnr.nextLine();
            }
            else if (scnr.nextLine().equalsIgnoreCase("all done"))
            {
                dontStop = false;
            }
            else
            {
                System.out.println("That is invalid input.");
            }
        }
    }
}
