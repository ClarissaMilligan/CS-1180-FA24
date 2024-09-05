public class Overflow
{
    public static void main(String[] args)
    {
        // initialize an integer that is the max positive
        // value that an integer can hold
        int bigNumber = 2147483647;
        System.out.println(bigNumber);

        // add 5 to that value (you can also try multiplyng by 2
        bigNumber = bigNumber + 5;
        // the result that prints to the console will be negative
        // because of a Java property called overflow.
        // there is a positive max value that can be held in any numeric datatype
        // and if this value is exceeded then the value wraps around to
        // negative value max.
        System.out.println(bigNumber);

        // every time we type a number in Java without a decimal place
        // the compiler assumes the value is an integer.
        // this is fine when our division result is an integer...
        double ans = 9 / 3;
        System.out.println(ans);
        // however, when our division result is a decimal value,
        // Java does not keep track of any numbers after the decimal place
        ans = 9 / 2;
        System.out.println(ans);

        // we can use casting to force the integer 9 to be recognized as a
        // double instead.
        // this method is explicit type-casting
        ans = (double) 9 / 2;
        System.out.println(ans);

        // we have to be careful with our parentheses though.
        // in this case the cast is applied to the result of the
        // integer division at which point the decimal data has
        // already been lost
        ans = (double) (9 / 2);
        System.out.println(ans);

        // we can also put a decimal place after the 9 or 2 (or both!)
        // to force the compiler to do decimal division and give us
        // a decimal result instead of an integer
        ans = 9.0 / 2;
        System.out.println(ans);

        // the Java compiler will generally allow us to assign less-precise
        // values (like int) to more precise values (like double) but not
        // the other way around.
        // thus, if we decide that we don't care about the decimal places
        // we can force the compiler to convert the value to an integer.
        // just keep in mind, this does not round the value but simply
        // truncates it and removes all the data after the decimal point
        double bigDec = 46628.3874368 / 3;
        System.out.println(bigDec);
        int integer = (int) bigDec;
        System.out.println(integer);
    }
}