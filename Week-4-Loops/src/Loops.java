public class Loops
{
    public static void main(String[] args)
    {
        int count = 5;

        while (count > 0)
        {
            System.out.println(count);
            count = count - 1;
        }

        System.out.println();

        count = -5;
        while (count <= 0)
        {
            System.out.println(count);
            count = count + 1;
        }

        System.out.println();

        count = 5;
        do
        {
            System.out.println(count);
            count--;
        }
        while (count > 0);

        System.out.print("\n");

        // count-- is equivalent to count = count - 1 is equivalent to count -= 1
        for (count = 5; count > 0; count -= 1)
        {
            System.out.println(count);
        }

        System.out.println();

        for (count = 0; count <= 5; count = count + 1)
        {
            System.out.println(count);
        }
    }
}