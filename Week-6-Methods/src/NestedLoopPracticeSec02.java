public class NestedLoopPracticeSec02
{
    public static void main(String[] args)
    {
        int iMax = 11;
        int jMax = 11;

        for (int i = 0; i < iMax; i++)
        {
            for (int j = 0; j < jMax; j++)
            {
                if (i == 0 || i == (iMax - 1))
                {
                    System.out.print("- ");
                }
                else if (j == 0 || j == (jMax - 1))
                {
                    System.out.print("| ");
                }
                else if (i == (iMax - 1)/2 && j == (jMax - 1)/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
