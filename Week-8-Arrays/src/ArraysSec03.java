import java.util.Arrays;

public class ArraysSec03
{
    public static void main(String[] args)
    {
        int[] ages = new int[4];

        ages[0] = 45;
        ages[3] = 88;

        System.out.println(ages);

        System.out.println(Arrays.toString(ages));

        // ages[-5] = 60;

        ages[2] = ages[0] + 5;

        System.out.println(Arrays.toString(ages));

        int[] copyOfAges = ages;

        copyOfAges[1] = 99;

        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(copyOfAges));

        ages[1] = 100;

        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(copyOfAges));

        int[] copyOfAges2 = ages.clone();

        copyOfAges2[1] = 10;

        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(copyOfAges2));

        Arrays.sort(copyOfAges2);
        System.out.println(Arrays.toString(copyOfAges2));

        System.out.println(ages[ages.length - 1]);
    }
}
