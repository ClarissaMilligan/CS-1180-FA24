import java.util.Scanner;

public class NestedLoopReview02
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("How many patients would you like to enter?");
        int numPatients = scnr.nextInt();

        for (int i = 0; i < numPatients; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (j == 0)
                {
                    System.out.print("What is the patient's ID? ");
                }
                else if (j == 1)
                {
                    System.out.print("What is the patient's age? ");
                }
                else
                {
                    System.out.print("What is the patient's hr? ");
                }

                int info = scnr.nextInt();
                System.out.println(info);
            }
        }
    }
}