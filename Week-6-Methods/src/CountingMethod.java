import java.util.Scanner;

public class CountingMethod
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.print("How high do you want to count? ");
        int countTo = scnr.nextInt();

        System.out.print("Do you want to skip odd numbers? (true/false) ");
        boolean skipOdd = scnr.nextBoolean();

        count(countTo, skipOdd);
    }

    public static void count(int highestNum, boolean skipOdds)
    {
        for (int i = 0; i <= highestNum; i++)
        {
            if (!skipOdds || i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
