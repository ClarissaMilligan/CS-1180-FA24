public class Variables
{
    public static void main(String[] args)
    {
        // different ways to declare integer variables
        // and assign values
        int x = 5;
        int y;
        y = 10;

        // print out original values
        System.out.println("x: " + x + " y: " + y);

        // update x to 22
        // assign x's value to y
        // y is now also 22
        x = 22;
        y = x;
        System.out.println("x: " + x + " y: " + y);

        // update x to 14
        // y does not change as it still has x's old value: 14
        x = 14;
        System.out.println("x: " + x + " y: " + y);

        // define a variable and assign it a character
        char letter = 'a';
        System.out.println("letter: " + letter);

        // change the character value
        letter = 'b';
        System.out.println("letter: " + letter);

        // define a boolean
        // often times programmers name boolean variables as if they are a question
        // that can be answered with either true or false
        boolean isItTrue = true;
        System.out.println("isItTrue: " + isItTrue);

        // defines a double (decimal) value
        // double and float are both decimal values
        // however, double offers us more precision and will be our default
        double decimal = 5.5;
        System.out.println("decimal: " + decimal);

        // We can store x in decimal because doubles can hold integer and decimal values
        decimal = x;
        // We can't store decimal in x because x can only hold integer values
        // x = decimal;
        System.out.println("decimal: " + decimal);
    }
}
