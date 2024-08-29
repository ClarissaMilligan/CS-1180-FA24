// You need to make sure to import the Scanner in order
// to get input from the user since Scanner is not
// built-in to Java
import java.util.Scanner;

public class UserInfo
{
    public static void main(String[] args)
    {
        // Scanner initialization
        // 'new' indicates to the compiler that we are
        // creating a new instance of the Scanner class
        Scanner input = new Scanner(System.in);

        // Grabs the name of a user regardless of if
        // they use spaces or not
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println(name);

        // Grabs the age of the user
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println(age);

        // Grabs the user's favorite decimal number
        System.out.println("What's your favorite decimal number?");
        double favNum = input.nextDouble();
        System.out.println(favNum);

        // Adds the user's age to their favorite number
        System.out.print("Your favorite number plus your age is: ");
        System.out.println(age + favNum);

        // Rounds the sum down using the floor method
        double output = Math.floor(age + favNum);
        System.out.println("Rounded down: " + output);

        // Rounds the number
        long output2 = Math.round(age + favNum);
        System.out.println("Rounded to nearest whole number: " + output2);
    }
}
