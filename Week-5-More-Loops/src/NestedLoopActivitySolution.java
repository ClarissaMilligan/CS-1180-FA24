import java.util.Scanner;

public class NestedLoopActivitySolution
{
    public static void main(String[] args)
    {
        // initialize variables
        Scanner scnr = new Scanner(System.in);
        int numAccounts = 0;
        int numDeposits = 0;
        double depositSum = 0.0;

        // prompt the user for the number of accounts they will create
        System.out.println("Please enter the number of accounts you want to make: ");
        numAccounts = scnr.nextInt();

        // prompt the user for the number of deposits each account will make
        System.out.println("Please enter the number of deposits you want to make per account: ");
        numDeposits = scnr.nextInt();

        // for loop that will loop for each account
        // we use numAccounts to know how many times our loop will run
        for (int i = 0; i < numAccounts; i++)
        {
            // tells the user what account we are working with
            System.out.println("Account #" + i);
            System.out.println("-----------");

            // continue to ask the user for all the deposits for that account
            // use numDeposits to be able to prompt for each deposit
            for (int j = 0; j < numDeposits; j++)
            {
                // request the deposit value for the specific deposit
                System.out.println("Enter value of deposit #" + j + ": ");
                // add the requested value to the sum
                depositSum = depositSum + scnr.nextDouble();
            }

            // print out the total deposits for each account
            // printf is used to print out the dollar amount to 2 decimal places
            System.out.printf("Account #%d has a total of $%.2f\n\n", i, depositSum);
            // reset the deposit value for the next account
            depositSum = 0.0;
        }
    }
}
