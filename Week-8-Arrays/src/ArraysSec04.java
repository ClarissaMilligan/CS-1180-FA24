import java.util.Arrays;

public class ArraysSec04
{
    public static void main(String[] args)
    {
        boolean[] isRetired = new boolean[22];

        System.out.println(isRetired);

        System.out.println(Arrays.toString(isRetired));

        String[] names = {"Clarissa", "Subiksha", "Reese"};

        System.out.println(names[2]);

        names[2] = "Blake";

        System.out.println(Arrays.toString(names));

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] copy = names;

        copy[0] = "Joe";

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(copy));

        names[0] = "fred";

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(copy));

        String[] deepCopy = names.clone();

        names[0] = "Tom";

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(deepCopy));

        System.out.println(names[names.length - 1]);

    }
}
