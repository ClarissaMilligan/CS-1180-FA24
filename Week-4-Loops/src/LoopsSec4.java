public class LoopsSec4
{
    public static void main(String[] args)
    {
        // count down from 0 to -10
        int counter = 0;
        // since the last number we want to print is -10, we say > -11
        while (counter > -11)
        {
            // printing first means that 0 will get printed and then decremented
            System.out.println(counter);
            counter = counter - 1;
        }

        System.out.println();

        // count down from 0 to -10
        counter = 0;
        do
        {
            System.out.println(counter);
            counter = counter - 1;
        }
        // in this case we changed our conditional to >= -10, but the output will be the same as the while loop
        while (counter >= -10);

        System.out.println();

        // count down from 0 to -10
        // we use count here, but we could create a new variable if we wanted
        // if the variable is declared in the loop header, it will only be accessible from within the loop
        for (counter = 0; counter >= -10; counter--)
        {
            // we only need to print inside the loop because the header handles initialization, conditional, and decrementation
            System.out.println(counter);
        }
    }
}
