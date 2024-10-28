import java.util.ArrayList;
import java.util.Arrays;

public class MoreArraysSec03
{
    public static void main(String[] args)
    {
        double[][] accounts = new double[3][3];

        // set the first deposit for the first account
        accounts[0][0] = 3000;

        // set the second deposit for the first account
        accounts[0][1] = 750;

        // set the third deposit for the first account
        accounts[0][2] = 55.55;

        // print deposit history for the first account
        // (print the first array in my array of arrays)
        System.out.println(Arrays.toString(accounts[0]));

        // set the third deposit for the third account
        accounts[2][2] = 435.96;

        // set the second deposit for the second account
        accounts[1][1] = 999.99;

        System.out.println(Arrays.toString(accounts[0]));
        System.out.println(Arrays.toString(accounts[1]));
        System.out.println(Arrays.toString(accounts[2]));

        for (int i = 0; i < accounts.length; i++)
        {
            //System.out.println(Arrays.toString(accounts[i]));
            for (int j = 0; j < accounts[i].length; j++)
            {
                System.out.println(accounts[i][j]);
            }
        }

        ArrayList<String> names = new ArrayList<>();

        names.add("Clarissa");
        names.add("Bob");
        names.add("Ted");
        System.out.println(names);

        names.set(2, "Fred");
        System.out.println(names);

        names.add(0, "Pam");
        System.out.println(names);

        System.out.println(names.indexOf("Clarissa"));
        System.out.println(names.get(3));

        // names.get(4);

        System.out.println(names.contains("Bob"));

        names.clear();
        System.out.println(names);

        ArrayList<Integer> ghj = new ArrayList<>();
        ghj.add(5);

    }
}
