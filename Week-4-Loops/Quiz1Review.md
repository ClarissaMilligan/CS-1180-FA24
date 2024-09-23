# Quiz One Review

## Question One
* Remember that primitive types start with a lowercase letter
* String is not a primitive type. It was written in Java.

## Question Two
* Note that semicolons were missing from two of the lines
* Remember that when we say 'y = x', we are assigning the current *value* of x to y. If x is changed, y will not update unless x's value is reassigned to it

## Question Three
* Remember, classes typically start with an uppercase letter and methods with a lowercase
* Other ways to identify methods are that it is located to the right of the period and that it has parentheses at the end

## Question Four
### Part i
* Note that the first line of code is just a *print* statement, therefore there is no newline after "Hi!"
* Additionally, there is no space after the exclamation point

### Part ii
* Remember that the percent sign is used to indicate where the variable will be substituted and will not be printed

## Question Five
* GPAs are typically represented with at least one decimal place, so nextDouble() would be most appropriate

## Question Six
* Remember that the modulus operator (%) returns the remainder of division
* In this case, that would be 0 because 16 is evenly divisible by 4

## Question Seven
* Java handles values that exceed the max of their datatype through overflow
* **There is no error**
* Instead, the value wraps around to the smallest negative value of the datatype or vice versa

## Question Eight
* **Most missed question**
* Java recognizes numbers without a decimal point as integers by default
* When one integer is divided by another, Java returns the result as an integer
* This happens regardless of the data type of the variable that the result is saved in
* So in this case, 7 divided by 2 results in 3 instead of 3.5 because Java stores the result in an integer, truncating (removing) everything after the decimal place
* Because we are saving it to a double, Java adds a .0 after the 3

## Question Nine
* Java will not automatically perform data type conversions that lose information
* Therefore, 7.65 which Java recognizes as a decimal will not automatically be converted to an integer which would result in the loss of the information after the decimal point
* We can force Java to do this through type casting: `int num = (int) 7.65;` but if we don't type cast, an error will occur

## Question Ten
### One
* `x > y` >>> `5 > -7` >>> This is a **true** statement

### Two
* `x >= -5` >>> `5 >= -5` >>> This is a **true** statement. A positive 5 is greater than a -5.

### Three
* `!(!(!(guess)))` >>> `!(!(!(false)))` >>> `!(!(true))` not false becomes true >>> `!(false)` not true becomes false >>> `true` not false becomes true. The statement is **true**.

### Four
* `x > y && y > 0` >>> `5 > -7 && -7 > 0` >>> `true AND false` >>> `false` The result is **false** because y = -7 is not greater than zero. Since we are using the AND (&&) operation here, both of the parts must be true for the output to be true.

### Five
* `x == -7 || y == -7` >>> `5 == -7 || -7 == -7` >>> `false OR true` >>> `true` The result is **true** because y is equal to -7. Since we are using the OR (||) operation here, only one of the parts must be true for the output to be true.
* Also, remember that the double equal signs (==) check for equality. In other words, they say _is this equal to that_
* The single equal sign (=), also called the assignment operator, assigns a value to a variable or object. In other words, it says _this is equal to that_
