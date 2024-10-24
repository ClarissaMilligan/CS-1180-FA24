import java.io.*;
import java.util.Scanner;

public class FileActivitySolution
{
    public static void main(String[] args) throws IOException
    {
        // assumes that the file already exists and creates a file object
        File inputFile = new File("nums.txt");
        // creates the scanner to read from that file
        Scanner numsFile = new Scanner(inputFile);

        // initialize variables
        double[] nums = new double[5];
        int index = 0;
        double runningSum = 0;
        double currentNum = 0;

        // loops while the file has another double
        while(numsFile.hasNextDouble())
        {
            // grabs the next double from the file
            currentNum = numsFile.nextDouble();
            // saves the double to the array
            nums[index] = currentNum;
            // add to the running sum
            runningSum = runningSum + currentNum;
            // increment index
            index++;
        }
        // print out sum
        System.out.println("Sum is: " + runningSum);
    }
}
