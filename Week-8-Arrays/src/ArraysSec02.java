import java.util.Arrays;

public class ArraysSec02
{
    public static void main(String[] args)
    {
        double[] gpas = new double[3];

        System.out.println(Arrays.toString(gpas));

        gpas[0] = 3.7;

        System.out.println(Arrays.toString(gpas));

        gpas[2] = 4.0;

        System.out.println(Arrays.toString(gpas));

        // get the last value in the array
        System.out.println(gpas[gpas.length - 1]);

        double[] copyOne = gpas;

        copyOne[1] = 2.3;

        System.out.println(Arrays.toString(gpas));
        System.out.println(Arrays.toString(copyOne));

        gpas[1] = 2.6;

        System.out.println(Arrays.toString(gpas));
        System.out.println(Arrays.toString(copyOne));

        double[] copyTwo = gpas.clone();

        copyTwo[2] = 3.9;

        System.out.println(Arrays.toString(gpas));
        System.out.println(Arrays.toString(copyTwo));

        Arrays.sort(gpas);
        System.out.println(Arrays.toString(gpas));
    }
}
