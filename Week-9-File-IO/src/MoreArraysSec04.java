import java.util.ArrayList;
import java.util.Arrays;

public class MoreArraysSec04
{
    public static void main(String[] args)
    {
        double[][] accounts = new double[4][3];

        Object[][] array = { {3.0, 5.6}, {true, false}, {3, 5} };

        // set the first deposit for the first account
        accounts[0][0] = 750;

        // set the second deposit for the first account
        accounts[0][1] = 3000.0;

        // set the third deposit for the first account
        accounts[0][2] = 55.55;

        // print out deposit history for first account
        System.out.println(Arrays.toString(accounts[0]));

        // set the second deposit for the third account
        accounts[2][1] = 653.24;

        // set the third deposit for the fourth account
        accounts[3][2] = 75.64;

        // print out all the accounts
        System.out.println(Arrays.toString(accounts));

        for (int i = 0; i < accounts.length; i++)
        {
            System.out.println(Arrays.toString(accounts[i]));
        }

        for (int i = 0; i < accounts.length; i++)
        {
            for (int j = 0; j < accounts[i].length; j++)
            {
                System.out.println(accounts[i][j]);
            }
        }


        ArrayList<String> classList = new ArrayList<>();

        classList.add("Alex");
        classList.add("Patrick");
        classList.add("Brianna");
        classList.add("Alice");

        System.out.println(classList);

        classList.add(2, "Brian");

        System.out.println(classList);

        classList.set(2, "James");

        System.out.println(classList);

        System.out.println(classList.get(3));

        System.out.println(classList);

        System.out.println(classList.remove(3));

        System.out.println(classList);

        System.out.println(classList.indexOf("Alice"));

        classList.clear();

        System.out.println(classList);

        classList.get(2);

    }
}
