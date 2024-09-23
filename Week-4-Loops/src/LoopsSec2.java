public class LoopsSec2
{
    public static void main(String[] args)
    {
        int count = 5;

        // counts down from 5 to 1
        while (count > 0)
        {
            // since we start at 5, we print first, then decrement
            System.out.println(count);
            count = count - 1;
        }

        System.out.println();

        // counts up from -5 to 0
        count = -5;
        while (count <= 0)
        {
            // again since we start at -5, we print first, then increment
            System.out.println(count);
            count = count + 1;
        }

        System.out.println();

        // counts down from 5 to 1
        count = 5;
        do
        {
            System.out.println(count);
            count--;
        }
        // loop has same structure as the first while loop
        while (count > 0);

        System.out.print("\n");

        // since count already exists, we don't have to declare its type again
        // now count's scope is not limited to the loop
        // count-- is equivalent to count = count - 1 is equivalent to count -= 1
        for (count = 5; count > 0; count -= 1)
        {
            // for loop handles initialization, conditional, and decrementation in the header,
            // so we only need to print inside the loop
            System.out.println(count);
        }

        System.out.println();

        // counts from 0 up to 5
        for (count = 0; count <= 5; count = count + 1)
        {
            System.out.println(count);
        }
    }
}