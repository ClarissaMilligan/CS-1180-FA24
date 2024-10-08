import java.util.Scanner;

public class AdmissionMethod
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double gpa = scnr.nextDouble();

        System.out.print("Enter ACT score: ");
        int act = scnr.nextInt();

        System.out.print("I submitted an essay (true/false): ");
        boolean hasEssay = scnr.nextBoolean();

        if (meetsRequirements(gpa, act, hasEssay))
        {
            System.out.println("You meet the requirements!");
        }
        else
        {
            System.out.println("Sorry, you don't meet the requirements.");
        }
    }

    public static boolean meetsRequirements(double gpa, int act, boolean essay)
    {
        boolean canAdmit = false;
        if (gpa >= 2.7 && act >= 25 && essay)
        {
            canAdmit = true;
        }
        return canAdmit;
    }
}
