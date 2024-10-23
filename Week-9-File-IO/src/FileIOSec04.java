import java.io.*;
import java.util.Scanner;

public class FileIOSec04
{
    public static void main(String[] args) throws IOException
    {
        String fName = "Sec04ClassList.txt";
        String fName2 = "C:\\Users\\Clarissa Milligan\\Documents\\FA24\\data.txt";

        FileWriter writeFileHandle = new FileWriter(fName, true);
        PrintWriter outputFile = new PrintWriter(writeFileHandle);
        outputFile.println("George");
        outputFile.println("Pam");
        outputFile.close();

        String fileContents = "";

        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fName3 = consoleInput.nextLine();

        File readFileHandle = new File(fName3);
        Scanner fileInput = new Scanner(readFileHandle);

        while (fileInput.hasNextLine())
        {
            fileContents = fileInput.nextLine();
            System.out.println(fileContents);
        }
        fileInput.close();
    }
}
