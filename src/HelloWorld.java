public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");

//        1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 5;
//        System.out.println(myFavoriteNumber);

//        2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = "Marcus Munoz";
//        System.out.println(myString);

//        3. Change your code to assign a character value to myString. What do you notice?
//            -when changed to char it was unable to run the code because the string output could not be converted

//        4. Change your code to assign the value 3.14159 to myString. What happens?
//            -error code double cannot be converted when using numeric input, additonally when the number is wrapped in "" the error message that the number is not a string appears

//        5. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        -illegal start of expression error
//        float myNumber = 3.14F;
//        System.out.println(myNumber);

//        6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        -java: incompatible types: possible lossy conversion from double to long

//        7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        -code ran and showed in the terminal as 123.

//        8. Change your code to assign the value 123 to myNumber.
//        -code ran and showed in the terminal as 123.

//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//            -long cant have a decimal / int wont account for decimals.
//        9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        -java: incompatible types: possible lossy conversion from double to float
//        1. use double type
//        2. use an F at the end of the number to be identified as a float

//        10. Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        System.out.println(x);

//        What is the difference between the above code blocks? Explain why the code outputs what it does.
//        -first code block runs 5 and then adds 1 tp the number due to the increment operator
//        -second code block runs 6 and then runs 6 again on both proceeding prints.
//        -for the first block we are using POST increment, which uses the current value and then adds one,
//        the second block we are using Pre increment, where we increase the value of x and then use that increased value in our statement


//            11. Try to create a variable named class. What happens?
//                "class" is a reserved keyword that cannot be used as identifiers

//        12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//                - I expect that I might get an output of | theNumberThree "three" |

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(o);

//        Copy and paste the code above and then run it. Does the result match with your expectation?
//                -no, but after understanding that casting cannot be done from string to number it made more sense.

//        How is the above example different from the code block below?
//        int three = (int) "three";
//        What are the two different types of errors we are observing?
//                1. string cannot convert to int
//                2. unable to cast these types

//        13. Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;
//        x += 5;
//        int x = 3;
//        int y = 4;
//        y = y * x;
//            y *= 3;
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        x /= y;
//        y = y - x;
//        y -= x;

//        14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//        -you get an error for a wrong data type, you need to use the right type to match the variable.

    }
}

