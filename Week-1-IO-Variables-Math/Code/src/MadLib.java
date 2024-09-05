import java.util.Scanner;

public class MadLib
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Tell me a single word.");
        String word = scnr.next();

        System.out.println("Tell me a integer number.");
        int num = scnr.nextInt();

        System.out.println("Tell me a decimal number.");
        double dec = scnr.nextDouble();

        System.out.println("Once upon a time, " + dec + " years ago, there were " + num + " " + word + "(s).");
    }
}
