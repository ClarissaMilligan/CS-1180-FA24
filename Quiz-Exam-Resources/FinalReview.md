# All Review Questions for Final
## Jeopardy Game (Theory Questions)
### Logic & Loops
* What does `((6 > 7) || (-34 < 10)) && (45 < 90)` evaluate to?
  * true
* What are the two ways we can check for equality in an if statement and what are each used for?
  * ==: used for primitive data types
    .equals(): used for objects (like String)
* Name the four major loop variations in Java.
  * while loop, do-while loop, for loop, for-each loop
* What are some uses for nested loops?
  * Nested loops are ideal for working with multi-dimensional data. They are also useful for multi-dimensional arrays.
* Briefly describe the three parts of a standard for loop.
  * The variable initialization, the loop conditional, and the iteration step (update)
### Methods
* Where can I access variables that are defined in a method?
  * Variables defined within a method can only be accessed from within the scope of the method.
* List the components required to write a method header.
  * access modifier, return type, method name, parameters (data type and name)
* What does it mean to overload a method?
  * Overloading describes the concept that we can have multiple methods with the same name, provided that they take in parameters of different data types
* What does it mean to override a method?
  * Overriding occurs when we rewrite a method from a parent class in the child class. Both of these methods have the *exact* same method header
* What are the important implications of passing an object into a method (or returning the object)?
  * When an object reference is passed into or returned from a method, pass by reference occurs. This means that the reference is not copied but passed directly. If the object is passed into the method, the method can modify the object directly. If the object is returned, the caller of the method can modify the object directly.
### Arrays & File I/O
* What is the last index for an array that has a size of 10?
  * 9
* Why does the memory address get printed out when we try to print an array?
  * This happens because arrays are objects.
* If I create a two-dimensional array of integers, what am I actually storing in that array?
  * A two-dimensional array is an array of references. Each reference points to an array of integers.
* What is the difference between an absolute and relative file path?
  * The absolute path is the entire path from the root directory. It is more specific but less portable. The relative path is specified from the default working directory and therefore, is more portable.
* Describe how Java File I/O utilizes a buffer and file handle.
  * The OS creates an area in memory (a buffer) that the program can access. Assuming the program has the proper permissions, the contents of the file are copied to the buffer. Then the OS provides the program with a reference to the buffer (a file handle), so the program can indirectly access/modify the file contents.
### Keywords
* What is the void keyword?
  * Indicates that a method does not return anything.
* What is the public keyword?
  * Indicates that the method or variable can be accessed from anywhere (including outside the current class)
* What is the extends keyword?
  * Indicates an inheritance relationship between two classes
* What is the final keyword?
  * Indicates that a variable has a constant, never-changing value
* What is the static keyword?
  * Indicates that the method or variable does not require an object to be created for it to be accessed
### OOP Concepts
* What is the difference between the `this` keyword and the `super` keyword?
  * `this` is used to refer to fields and methods of the current class. `super` is used to refer to fields and methods of the parent class.
* What is encapsulation?
  * The concept of protecting our class data from unchecked modification. This involves marking our variables as private and creating getters and setters for controlled access.
* What is a constructor and when is it called?
  * The constructor is a special method with the same name as the class and no return type that is used to initialize data for the class. It is called when an object is created.
* What is the difference between a class and an object?
  * An object is an instance (or version) of the class. There can be many objects of the same class.
* What is polymorphism?
  * Polymorphism is the idea that a child class can be referred to by the type of any of its parent classes. For example, if a method took in the type 'Object', any object could be passed into that method because they all inherit from the Object class.

## mentimeter (Reading Code Questions)
### if statements (logic)
<ins>Question One</ins>

<img src="pics/Q1.png" alt="Q1" width="500"/>

* **false**
<br></br>

<ins>Question Two</ins>

<img src="pics/Q2.png" alt="Q2" width="500"/>

* **true**
<br></br>

<ins>Question Three</ins>

<img src="pics/Q3.png" alt="Q3" width="500"/>

* **inyes**
<br></br>

<ins>Question Four</ins>

<img src="pics/Q4.png" alt="Q4" width="500"/>

* **try again**
<br></br>

### Loops
<ins>Question Five</ins>

<img src="pics/Q5.png" alt="Q5" width="500"/>

* **012**
<br></br>

<ins>Question Six</ins>

<img src="pics/Q6.png" alt="Q6" width="500"/>

* **43210**
<br></br>

<ins>Question Seven</ins>

<img src="pics/Q7.png" alt="Q7" width="500"/>

* **infinite loop**
<br></br>

<ins>Question Eight</ins>

<img src="pics/Q8.png" alt="Q8" width="500"/>

* **hoorah**
<br></br>

<ins>Question Nine</ins>

<img src="pics/Q9.png" alt="Q9" width="500"/>

* **loop00loop11loop22**
<br></br>

### Arrays & ArrayLists
<ins>Question Ten</ins>

<img src="pics/Q10.png" alt="Q10" width="500"/>

* **nothing gets printed out**
<br></br>

<ins>Question Eleven</ins>

<img src="pics/Q11.png" alt="Q11" width="500"/>

* **1.02.07.04.0**
<br></br>

<ins>Question Twelve</ins>

<img src="pics/Q12.png" alt="Q12" width="500"/>

* **-5**
<br></br>

<ins>Question Thirteen</ins>

<img src="pics/Q13.png" alt="Q13" width="500"/>

* **Yay! you turned 30 years old, today!**
<br></br>

<ins>Question Fourteen</ins>

<img src="pics/Q14.png" alt="Q14" width="500"/>

* **27.08.0**
<br></br>

<ins>Question Fifteen</ins>

<img src="pics/Q15.png" alt="Q15" width="500"/>

* **watsup**
<br></br>

<ins>Question Sixteen</ins>

<img src="pics/Q16.png" alt="Q16" width="500"/>

* **[I@7b23ec81**
<br></br>

<ins>Question Seventeen</ins>

<img src="pics/Q17.png" alt="Q17" width="500"/>

* **[1, 0, 6, 4, 0]**
<br></br>

<ins>Question Eighteen</ins>

<img src="pics/Q18.png" alt="Q18" width="500"/>

* **truefalsetrue**
<br></br>

<ins>Question Nineteen</ins>

<img src="pics/Q19.png" alt="Q19" width="500"/>

* **error**
<br></br>

<ins>Question Twenty</ins>

<img src="pics/Q20.png" alt="Q20" width="500"/>

* **[birdie]**
<br></br>

<ins>Question Twenty-one</ins>

<img src="pics/Q21.png" alt="Q21" width="500"/>

* **0**
<br></br>

<ins>Question Twenty-two</ins>

<img src="pics/Q22.png" alt="Q22" width="500"/>

* **4**
<br></br>

<ins>Question Twenty-three</ins>

<img src="pics/Q23.png" alt="Q23" width="500"/>

* **error**
<br></br>

<ins>Question Twenty-four</ins>

<img src="pics/Q24.png" alt="Q24" width="500"/>

* **Pet@6acbcfc0**
<br></br>

<ins>Question Twenty-five</ins>

<img src="pics/Q25.png" alt="Q25" width="500"/>

* **Bandit: age 4**
<br></br>

## Whiteboard Problems (Writing Code Questions)
