public class Loops2
{
    public static void main(String[] args)
    {
        int count = 0;
        while (count < 10)
        {
            count++;
            System.out.println(count);
        }

        System.out.println();

        count = 1;
        do
        {
            System.out.println(count);
            count++;
        }
        while (count <= 10);

        System.out.println();

        // banana++ is equivalent to banana = banana + 1
        for (int banana = 1; banana <= 10; banana++)
        {
            System.out.println(banana);
        }

        System.out.println();

        for (int banana = 10; banana >= 1; banana--)
        {
            System.out.println(banana);
        }
    }
}
