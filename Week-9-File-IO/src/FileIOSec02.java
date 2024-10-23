import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileIOSec02
{
    public static void main(String[] args) throws IOException
    {
        Scanner console = new Scanner(System.in);

        String fileName = "dataSec02.txt";
        String fileName2 = "C:\\Users\\Clarissa Milligan\\Documents\\FA24\\data.txt";

//        FileWriter fileHandle = new FileWriter(fileName, true);
//        PrintWriter outputFile = new PrintWriter(fileHandle);
//
//        System.out.println("What do you want to write to the file?");
//        String userFileContents = console.nextLine();
//
//        outputFile.println(userFileContents);

//        outputFile.println("Hello!");
//        outputFile.println("How are you today?");
//        outputFile.close();

        boolean badUserInput = true;
        while (badUserInput)
        {
            try
            {
                System.out.println("What is the file name?");
                int fileNums = console.nextInt();
                String userFileName = fileNums + ".txt";

                File fileHandle2 = new File(userFileName);
                Scanner readFile = new Scanner(fileHandle2);

                String line = "";

                while (readFile.hasNextLine())
                {
                    line = readFile.nextLine();
                    System.out.println(line);
                }

                readFile.close();
                badUserInput = false;
            }
            catch (FileNotFoundException fNFE)
            {
                System.out.println("That file does not exist!");
            }
            catch (InputMismatchException iME)
            {
                System.out.println("You need to type an integer!");
                console.nextLine();
            }
        }



    }
}
