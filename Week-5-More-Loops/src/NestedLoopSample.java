public class NestedLoopSample
{
    public static void main(String[] args)
    {
        // outside loop will run five times
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Outside Loop – Before Inside Loop: " + i);
            // inside loop runs three times every time the outside loop runs
            // therefore, the inside loop runs a total of fifteen times
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Inside Loop: " + j);
            }
            System.out.println("Outside Loop – After Inside Loop: " + i);
        }
    }
}
