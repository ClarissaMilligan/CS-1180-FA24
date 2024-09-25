import java.math.BigDecimal;

public class FloatingPointLoopControl
{
    public static void main(String[] args)
    {
        // because we can't store some numbers (in particular 0.1) accurately in binary,
        // we end up with a rounding error that continues to grow as we continue to add 0.1
        // we want to avoid using double (or float) for loop control because they can be inaccurate and unpredictable
        System.out.println("double controlled loop");
        System.out.println("----------------------");
        for (double i = 0.0; i < 1.0; i = i + 0.1)
        {
            System.out.println(i);
        }

        // we can accomplish the same result of the above loop using int instead
        // essentially, we just move the decimal over by one in each place
        System.out.println("\nint controlled loop");
        System.out.println("----------------------");
        for (int i = 0; i < 10; i = i + 1)
        {
            System.out.println(i / 10.0);
        }

        //  note: the rounding issues occur regardless of whether we are in a loop or not
        System.out.println("\ndouble addition");
        System.out.println("---------------");
        double num = 0.0;
        System.out.println(num);
        num = num + 0.1;
        System.out.println(num);
        num = num + 0.1;
        System.out.println(num);
        num = num + 0.1;
        System.out.println(num);

        // often times, these rounding issues don't affect us because we don't need that many decimal places
        System.out.println("\nrounding to avoid inaccurate output");
        System.out.println("-----------------------------------");
        System.out.printf("The num is: %.2f\n", num);

        // if we absolutely have to have a precise representation, we can use a class called BigDecimal
        // typically we don't use this class because it is slower and bulkier than using the standard math operators
        // however, in cases where we are dealing with money, for example, it is important to have perfect accuracy
        System.out.println("\nusing BigDecimal to achieve accuracy");
        System.out.println("------------------------------------");
        BigDecimal num2 = new BigDecimal("0.0");
        BigDecimal val = new BigDecimal("0.1");
        System.out.println(num2);
        num2 = num2.add(val);
        System.out.println(num2);
        num2 = num2.add(val);
        System.out.println(num2);
        num2 = num2.add(val);
        System.out.println(num2);
    }

}