public class Loops3
{
    public static void main(String[] args)
    {
        // count up from -5 to 0
        int count = -5;
        while (count <= 0)
        {
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

        count = -5;
        do
        {
            System.out.println(count);
            count++;
        }
        while(count <= 0);

        System.out.println();

        for (count = -5; count <= 0; count++)
        {
            System.out.println(count);
        }
    }
}
