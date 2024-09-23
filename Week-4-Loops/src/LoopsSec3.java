public class LoopsSec3
{
    public static void main(String[] args)
    {
        // count up from -5 to 0
        int count = -5;
        // since we want 0 to print as well, our condition is <= 0
        while (count <= 0)
        {
            // since we start at -5, we print first and then increment
            System.out.println(count);
            count = count + 1;
        }

        System.out.println();

        // print 10, 9, 8, ... 1
        count = 10;
        while (count > 0)
        {
            System.out.println(count);
            count = count - 1;
        }

        System.out.println();

        // print -5 up to 0
        count = -5;
        do
        {
            System.out.println(count);
            count++;
        }
        // loop has same structure as the while loop
        while(count <= 0);

        System.out.println();

        // print -5 up to 0
        // we can use the count variable since it is already defined
        // if we wanted our variable to only be accessible inside the loop,
        // then we could declare a new variable instead of using count
        for (count = -5; count <= 0; count++)
        {
            // loop header handles initialization, the conditional, and incrementation,
            // so we just need to print the value inside the loop
            System.out.println(count);
        }
    }
}
