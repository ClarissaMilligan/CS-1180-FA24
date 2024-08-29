
/** @author Clarissa
 *
 */
public class HelloWorld
{
    /*
    main method does x
    y
    and z
    */
    public static void main(String[] args)
    {
        // Prints to console
        System.out.println("Hello World! Welcome to CS-1180!!"); // "say hi"

        // Notice that the value of 'num' changes to 6 after we set num
        // equal to 6 with the assignment operator
        int num = 5;
        System.out.print(num);
        num = 6;
        System.out.println(num);

        // Demonstrates calling a method on an object
        // An object is an instance of a class
        String randomLetters = "AbCdEghIj";

        // toLowerCase() returns the lowercase version of the String
        // We need to assign this value back to our original String
        // in order to save the lowercase version to the variable
        randomLetters = randomLetters.toLowerCase();
        System.out.println(randomLetters);
    }
}