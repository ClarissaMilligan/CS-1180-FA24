public class LoopsSec1
{
    public static void main(String[] args)
    {
        // loop to count up from 1 to 10 and print the result
        int count = 0;
        // we can say <10 because we increment before we print
        // thus when count = 9, we enter the loop, increment to 10 and print
        while (count < 10)
        {
            // since our initial value is 0 we must increment the value first
            count++;
            System.out.println(count);
        }

        System.out.println();

        // reset our value back to 1 before our next loop
        count = 1;
        do
        {
            // this time since we start at 1, we don't have to increment first
            System.out.println(count);
            count++;
        }
        // since we print first this time, we need to say <= 10
        // thus when count = 10, we enter the loop, increment to 11 and exit
        while (count <= 10);

        System.out.println();

        // in this case, we could use the count variable we already defined
        // we would just not say int in front of it again
        // banana++ is equivalent to banana = banana + 1
        for (int banana = 1; banana <= 10; banana++)
        {
            // since the for loop can handle initialization, the conditional, and incrementation in the loop header,
            // we don't need to do anything besides printing the value in the loop body
            System.out.println(banana);
        }

        System.out.println();

        // starts at 10 and counts down to 1
        for (int banana = 10; banana >= 1; banana--)
        {
            System.out.println(banana);
        }
    }
}
