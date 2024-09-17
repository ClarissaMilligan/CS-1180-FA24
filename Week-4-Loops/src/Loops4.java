public class Loops4
{
    public static void main(String[] args)
    {
        // count down from 0 to -10

        int counter = 0;
        while (counter > -11)
        {
            System.out.println(counter);
            counter = counter - 1;
        }

        System.out.println();

        counter = 0;
        do
        {
            System.out.println(counter);
            counter = counter - 1;
        }
        while (counter >= -10);

        System.out.println();

        for (counter = 0; counter >= -10; counter--)
        {
            System.out.println(counter);
        }
    }
}
