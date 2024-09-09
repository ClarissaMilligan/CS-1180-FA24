import java.util.Scanner;

public class GradeProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Input grade on 1st assignment (0-100): ");
        double grade1 = input.nextDouble();

        System.out.println("Input grade on 2nd assignment (0-100): ");
        double grade2 = input.nextDouble();

        System.out.println("Input grade on 3rd assignment (0-100): ");
        double grade3 = input.nextDouble();

    }
}
