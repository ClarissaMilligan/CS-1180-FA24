import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MoreArraysSec01
{
    public static void main(String[] args)
    {
        double[][] accounts = new double[5][3];

        accounts[0][0] = 500;
        accounts[0][1] = 750;
        accounts[0][2] = 125;

        System.out.println(Arrays.toString(accounts[0]));

        accounts[1][0] = 10;
        accounts[1][1] = 10;
        accounts[1][2] = 10;

        System.out.println(Arrays.toString(accounts[1]));

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

        classList.add("Coleman");
        classList.add("Adam");
        classList.add("Alice");
        classList.add("Davina");
        classList.add("Blake");

        System.out.println(classList);

        classList.add(3, "Damir");

        System.out.println(classList);

        classList.set(0, "Ari");

        System.out.println(classList);

        System.out.println(classList.get(4));
        System.out.println(classList);

        System.out.println(classList.remove(2));
        System.out.println(classList);

        System.out.println(classList.indexOf("Damir"));
        System.out.println(classList.contains("Coleman"));

        classList.clear();
        System.out.println(classList);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(16);
    }
}
