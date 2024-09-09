import java.util.Scanner;

public class Ternary
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        int currTemp = scnr.nextInt();

        String temp = (currTemp > 60) ? "warm" : "cool";
        System.out.println(temp);


    }
}
