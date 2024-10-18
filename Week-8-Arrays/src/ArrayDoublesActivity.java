import java.util.Arrays;

public class ArrayDoublesActivity
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(doublesArray(5, 4)));
    }

    public static double[] doublesArray (double startingValue, int numOfDoubles)
    {
        double[] doubleValues = new double[numOfDoubles];

        for (int i = 0; i < doubleValues.length; i++)
        {
            doubleValues[i] = startingValue;
            startingValue = startingValue * 2;
        }

        return doubleValues;
    }
}
