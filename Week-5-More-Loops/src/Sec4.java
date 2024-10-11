public class Sec4
{
    public static void main(String[] args)
    {
        int iMax = 7;
        int jMax = 7;

        for (int i = 0; i < iMax; i++)
        {
            for (int j = 0; j < jMax; j++)
            {
                if (i == 0 || j == 0 || i == (iMax - 1) || j == (jMax - 1))
                {
                    System.out.print("~");
                }
                else
                {
                    System.out.print("#");
                }
            }

            System.out.println();
        }

    }
}
