import java.util.Scanner;

public class UserInputLoop
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        while(scnr.hasNext())
        {
            int num = scnr.nextInt();
            System.out.println(num);

            String userInput = scnr.next();
            System.out.println(userInput);


        }
    }
}
