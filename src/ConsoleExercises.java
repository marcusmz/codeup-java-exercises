import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

//        1. Copy this code into your main method:
//            double pi = 3.14159;
//     Write some Java code that uses the variable pi to output the following:
//     The value of pi is approximately 3.14.
//     Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
//        System.out.printf("The value of pi is approximately %.2f.", pi);

//        EXPLORE SCANNER CLASS
//        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        What happens if you input something that is not an integer?
//        -If you enter something that is not an intger you will get an error code because there is no conversions to be made

                Scanner scanner = new Scanner(System.in);
//                System.out.println("please enter an integer");
//                int userInput = scanner.nextInt();

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//                What happens if you enter less than 3 words?
//        -The code will never finish running, it is waiting for an input of at least 3 words
//                What happens if you enter more than 3 words?
//        -The white space after the first input indicates the end of the input so any additional text will not be read

//        String first;
//        String second;
//        String third;
//        System.out.println("please enter 3 new words");
//        first = scanner.next();
//        System.out.println("please enter next word");
//        second = scanner.next();
//        System.out.println("last word");
//        third = scanner.next();
//        System.out.println("Your 3 words were: \n" + first +"\n" + second +"\n" + third +"\n" );

//        3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        do you capture all the words?
//        -with the next method you only capture the first word, whitespace ends the variable. next line encapsulates all words.
//        String sentence;
//        System.out.println("Enter a sentence:");
//        sentence = scanner.nextLine();
//        System.out.println(sentence);
//        System.out.printf("The sentence you wrote was: %s", sentence);

        //CALCULATE THE PERIMETER AND AREA OF CODEUPS CLASSROOM
//        1 .Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width.
//        Parse the resulting strings to a numeric type.
//        -Assume that the rooms are perfect rectangles.
//        -Assume that the user will enter valid numeric data for length and width.
//
//        System.out.println("Enter the length of your classroom:");
//        String length = scanner.nextLine();
//        System.out.println("Enter the width of your classroom:");
//        String width = scanner.nextLine();
//        int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) * 2;
//        System.out.printf("The perimeter of your classroom is %d%n", perimeter);



    }
}
