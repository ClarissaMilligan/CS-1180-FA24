import java.util.Arrays;

public class ArraysSec01
{
    public static void main(String[] args)
    {
        String[] months = {"jan", "feb", "mar", "apr"};

        System.out.println(months);

        System.out.println(Arrays.toString(months));
        System.out.println(months[3]);

        months[3] = "fds";
        System.out.println(Arrays.toString(months));

        String[] shallowCopy = months;

        shallowCopy[3] = "apr";

        System.out.println(Arrays.toString(months));
        System.out.println(Arrays.toString(shallowCopy));

        months[2] = "abc";

        System.out.println(Arrays.toString(months));
        System.out.println(Arrays.toString(shallowCopy));

        String[] deepCopy = months.clone();

        deepCopy[2] = "mar";

        System.out.println(Arrays.toString(months));
        System.out.println(Arrays.toString(deepCopy));

        Arrays.sort(deepCopy);

        System.out.println(Arrays.toString(deepCopy));



    }
}
