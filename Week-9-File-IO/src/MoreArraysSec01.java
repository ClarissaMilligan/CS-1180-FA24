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
    }
}
