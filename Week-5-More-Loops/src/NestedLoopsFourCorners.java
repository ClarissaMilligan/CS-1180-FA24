public class NestedLoopsFourCorners
{
    public static void main(String[] args)
    {
        // we define variables for essentially the length and width of the rectangle we draw
        // we could choose to get these values from the user
        int maxI = 3;
        int maxJ = 3;

        // loops until we reach the max size defined above
        for (int i = 0; i < maxI; i++)
        {
            // loops until we reach the max size defined above
            for (int j = 0; j < maxJ; j++)
            {
                // here we use i and j like coordinates to locate the four corners of the rectangle
                //       TOP LEFT             TOP RIGHT                             BOTTOM LEFT                    BOTTOM RIGHT
                if ((i == 0 && j == 0) || (i == 0 && j == (maxJ - 1)) || (i == (maxI - 1) && j == 0) || (i == (maxI - 1) && j == (maxJ - 1)))
                {
                    // we replace the corners with an X symbol
                    // note: to get our characters to print on the same line for each row, we use print here
                    System.out.print("X");
                }
                else
                {
                    // all other locations are represented with the pound sign
                    // note: to get our characters to print on the same line for each row, we use print here
                    System.out.print("#");
                }
            }
            // we print a new line here to start on the next row
            System.out.println();
        }

    }
}
