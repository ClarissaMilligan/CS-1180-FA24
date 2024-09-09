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

        if (grade1 >= 89.5)
        {
            System.out.println("Grade 1: A");
        }
        else if (grade1 >= 79.5)
        {
            System.out.println("Grade 1: B");
        }
        else if (grade1 >= 69.5)
        {
            System.out.println("Grade 1: C");
        }
        else if (grade1 >= 59.5)
        {
            System.out.println("Grade 1: D");
        }
        else
        {
            System.out.println("Grade 1: F");
        }

        if (grade2 >= 89.5)
        {
            System.out.println("Grade 2: A");
        }
        else if (grade2 >= 79.5)
        {
            System.out.println("Grade 2: B");
        }
        else if (grade2 >= 69.5)
        {
            System.out.println("Grade 2: C");
        }
        else if (grade2 >= 59.5)
        {
            System.out.println("Grade 2: D");
        }
        else
        {
            System.out.println("Grade 2: F");
        }

        if (grade3 >= 89.5)
        {
            System.out.println("Grade 3: A");
        }
        else if (grade3 >= 79.5)
        {
            System.out.println("Grade 3: B");
        }
        else if (grade3 >= 69.5)
        {
            System.out.println("Grade 3: C");
        }
        else if (grade3 >= 59.5)
        {
            System.out.println("Grade 3: D");
        }
        else
        {
            System.out.println("Grade 3: F");
        }

        double avgGrade = (grade1 + grade2 + grade3) / 3;
        System.out.printf("The average grade is: %.2f", avgGrade);

    }
}
