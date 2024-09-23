import java.util.Scanner;

public class UserInput4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        while (keyboard.hasNext())
        {
            if (keyboard.hasNextInt())
            {
                int num = keyboard.nextInt();
                System.out.println(num);
            }
            else
            {
                keyboard.next();
            }
        }
    }
}
