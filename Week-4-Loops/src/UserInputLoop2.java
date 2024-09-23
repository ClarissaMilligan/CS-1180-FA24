import java.util.Scanner;

public class UserInputLoop2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt())
        {
            int userNum = scan.nextInt();
            System.out.println(userNum);
        }
    }
}
