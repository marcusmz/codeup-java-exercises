import java.util.Scanner;

//public class ControlFlowExercises {
//    public static void main(String[] args) {

//        1. BASIC LOOPS
//        a.While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

//        int num = 5;
//        while (num <= 15) {
//            System.out.print(num + " ");
//            num += 1;
//        }


//
//        b.Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        first
//        int num =0;
//        do {
//            System.out.println(num);
//            num += 2;
//
//        } while (num <= 100);

//        second
//        int num =100;
//        do {
//            System.out.println(num);
//            num -= 5;
//        } while (num >= -10);

//        long num =2;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1_000_000);

//
//
//        c.For
//        Refactor the previous two exercises to use a for loop instead.

//for (int i = 100; i >= -10; i -= 5) {
//    System.out.println(i);
//};


//        2. FIZZBUZZ
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }



//        3. DISPLAY A TABLE OF POWERS
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

//        boolean willContinue = false;
//        do {
//            System.out.println("Please enter an integer:");
//            Scanner sc = new Scanner(System.in);
//            int userInt = sc.nextInt();
//        System.out.println("You Entered: " + userInt + " | " + userInt * userInt + " | " + Math.pow(userInt, 3));
//            for (int i = 1; i <= userInt; i++) {
//                System.out.println("You Entered: " + i + " | " + i * i + " | " + (int) Math.pow(i, 3));
//            }
//
//            System.out.println("Do you want to enter another number? (y/n)");
//            String userResponse = sc.next().toLowerCase();
//            if (userResponse.equals("y")){
//                willContinue = true;
//            } else {
//                willContinue = false;
//            }
//        } while (willContinue);

//        4. Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

//        Scanner sc = new Scanner(System.in);
//
//        boolean anotherGrade = true;
//
//        do {
//            System.out.print("Please enter a numerical grade from 0 to 100 ");
//
//            int numericGrade = sc.nextInt();
//
//            if (numericGrade >= 88) {
//                System.out.println("A");
//            } else if (numericGrade >= 80) {
//                System.out.println("B");
//            } else if (numericGrade >= 67) {
//                System.out.println("C");
//            } else if (numericGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.print("Do you wish to enter a new grade? (y/n) ");
//
//            String userResponse = sc.next();
//
//            if (!userResponse.equalsIgnoreCase("y")) {
//                anotherGrade = false;
//            }
//
//        } while (anotherGrade);




//    }
//}
