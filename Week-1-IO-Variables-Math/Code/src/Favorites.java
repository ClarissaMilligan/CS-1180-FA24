import java.util.Scanner;

public class Favorites
{
    public static void main(String[] args)
    {
        // in most cases, we tend to use more descriptive names for variables
        // in this case, a better name might be keyboard or input
        Scanner banana = new Scanner(System.in);

        // collects a string response
        // we use nextLine in case the user has a favorite color that is two words
        // e.g. light blue
        System.out.println("What's your favorite color?");
        String favColor = banana.nextLine();
        System.out.println("Your favorite color is " + favColor);

        // collects a decimal (or integer!) response
        // we use double here so if the user enters a decimal value, then our code won't
        // cause an error
        System.out.println("What's your favorite number?");
        double favNum = banana.nextDouble();
        System.out.println("Your favorite number is " + favNum);
    }
}
