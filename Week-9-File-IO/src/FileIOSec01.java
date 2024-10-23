import java.io.*;
import java.util.Scanner;

public class FileIOSec01
{
    public static void main(String[] args) throws IOException
    {
        // we tend to prefer using relative paths due to portability
        String filename = "textFiles\\data.txt"; // relative path
        String filename2 = "C:\\Users\\Clarissa Milligan\\Documents\\FA24\\data.txt"; // absolute path

        // if we want to append, we need to use a FileWriter
        FileWriter fileHandle = new FileWriter(filename, true);
        // if we pass in a file name directly to the PrintWriter, it will always overwrite that file
        PrintWriter outputFile = new PrintWriter(fileHandle);

        outputFile.println("yay");
        outputFile.close();

        try
        {
            Scanner inputUser = new Scanner(System.in);
            System.out.println("what is the file name?");
            String userFilename = inputUser.nextLine();

            // File object is created to get the file handle to read from
            File readFileHandle = new File(userFilename);
            // We pass the file handle into the scanner to be able to actually read its contents
            Scanner inputFile = new Scanner(readFileHandle);

            String line = "";
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
