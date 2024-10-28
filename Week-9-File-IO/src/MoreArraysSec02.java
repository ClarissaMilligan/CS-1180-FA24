import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MoreArraysSec02
{
    public static void main(String[] args)
    {
        double[][] accounts = new double[4][2];

        // enter the value for the first deposit in the first account
        accounts[0][0] = 750.00;

        // enter the value for the second deposit in the first account
        accounts[0][1] = 5000.55;

        // enter the value for the second deposit in the third account
        accounts[2][1] = 237.34;

        // print out the total deposits for the first account
        System.out.println(Arrays.toString(accounts[0]));

        // print out all the deposits for all the accounts
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

        Object[] random = {3.5, "hello", false};


        ArrayList<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("panda");
        animals.add("wolf");
        animals.add("giraffe");
        System.out.println(animals);

        animals.add(3, "elephant");
        System.out.println(animals);

        animals.set(4, "lion");
        System.out.println(animals);

        System.out.println(animals.get(2));
        System.out.println(animals);

        System.out.println(animals.remove(2));
        System.out.println(animals);

        System.out.println(animals.indexOf("lion"));
        System.out.println(animals.size());
        System.out.println(animals.contains("hippo"));
        System.out.println(animals.contains("lion"));
        animals.clear();
        System.out.println(animals);

        ArrayList<Object> randomThings = new ArrayList<>();

        randomThings.add("hi");
        randomThings.add(5.5);
        randomThings.add(new Scanner(System.in));

        String blah = (String) randomThings.get(0);
        blah.indexOf('h');

        ArrayList<Integer> fhdsj = new ArrayList<>();

        fhdsj.add(4);
    }
}
