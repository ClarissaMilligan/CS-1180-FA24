import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileIOSec03
{
    public static void main(String[] args) throws IOException
    {
        Scanner consoleInput = new Scanner(System.in);
        String filename = "sec03.txt";
        String filename2 = "C:\\Users\\Clarissa Milligan\\Documents\\FA24\\data.txt";

        FileWriter fileHandle = new FileWriter(filename, true);
        PrintWriter outputFile = new PrintWriter(fileHandle);
        outputFile.println("CS-1180 Class List");
        outputFile.println("------------------");

        outputFile.close();

        boolean badUserInput = true;

        while (badUserInput)
        {
            try
            {
                System.out.println("What is the file name?");
                String userFileName = consoleInput.nextInt() + ".txt";

                File readFileHandle = new File(userFileName);
                Scanner fileInput = new Scanner(readFileHandle);
                String contents = "";

                while (fileInput.hasNextLine())
                {
                    contents = fileInput.nextLine();
                    System.out.println(contents);
                }
                fileInput.close();
                badUserInput = false;
            }
            catch (FileNotFoundException fNFE)
            {
                System.out.println("That file does not exist!!");
            }
            catch (InputMismatchException iME)
            {
                System.out.println("Input needs to be an integer!!");
                consoleInput.nextLine();
            }
        }
    }
}
