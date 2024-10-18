import java.io.*;
import java.util.Scanner;

public class FileIOSec01
{
    public static void main(String[] args) throws IOException
    {
        String filename = "data.txt";
        String filename2 = "C:\\Users\\Clarissa Milligan\\Documents\\FA24\\data.txt";

        FileWriter fileHandle = new FileWriter(filename, true);
        PrintWriter outputFile = new PrintWriter(fileHandle);

        outputFile.println("Hey what is up");
        outputFile.close();

        try
        {
            Scanner inputUser = new Scanner(System.in);
            System.out.println("what is the file name?");
            String userFilename = inputUser.nextLine();

            File readFileHandle = new File(userFilename);
            Scanner inputFile = new Scanner(readFileHandle);

            String line;
            while (inputFile.hasNextLine())
            {
                line = inputFile.nextLine();
                System.out.println(line);
            }
            inputFile.close();
        }
        catch (FileNotFoundException fNFE)
        {
            System.out.println("That file does not exist!!");
        }
    }
}
