import java.util.Arrays;

public class ArrayPracticeColors
{
    public static void main(String[] args)
    {
        int[] grades = new int[10];

        int[] grades2 = {1, 2, 3, 5, 8};

        System.out.println(Arrays.toString(grades));
        System.out.println(Arrays.toString(grades2));

        for (int i = (grades2.length - 1); i >= 0; i--)
        {
            System.out.println(grades2[i]);
        }

        double[][] weather = new double[3][5];
        //                    array 0                      array 1                      array 2                     array 3
        //                      0        1         2           0       1        2         0        1         2         0        1       2
        String[][] colors = { {"red", "orange", "yellow"}, {"green", "blue", "purple"}, {"pink", "black", "white"}, {"gray", "cyan", "brown"} };

        System.out.println(colors[1][2]);
        System.out.println(colors[3][1]);
        System.out.println(Arrays.toString(colors[2]));

        //for (int i = 0; i < colors.length; i++)
        for (int i = (colors.length - 1); i >= 0; i--)
        {
            //for (int j = 0; j < colors[i].length; j++)
            for (int j = (colors[i].length - 1); j >= 0; j--)
            {
                System.out.println(colors[i][j]);
            }
        }
    }
}
