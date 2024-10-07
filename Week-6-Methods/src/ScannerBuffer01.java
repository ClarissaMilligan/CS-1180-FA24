import java.util.Scanner;

public class ScannerBuffer01
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        boolean loop = true;

        while (loop)
        {
            if (scnr.hasNextInt())
            {
                System.out.println("int: " + scnr.nextInt());
                scnr.nextLine();
            }
            else if (scnr.hasNextDouble())
            {
                System.out.println("double: " + scnr.nextDouble());
                scnr.nextLine();
            }
            else if (scnr.nextLine().equalsIgnoreCase("done"))
            {
                loop = false;
            }
            else
            {
                System.out.println("Improper input");
            }
        }
    }
}
