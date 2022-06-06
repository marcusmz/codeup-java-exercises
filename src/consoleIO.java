import java.util.Scanner;

public class consoleIO {

    public static void main(String[] args){
        String cohort = "Go";
        String timeOfDay = "afternnon";
        byte week = 11;
        float someNumber = 123.456F;
//        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort. %n", week, cohort);
//        System.out.println("This is not going to appear on a new line.. well now it does");
//        System.out.printf("The chosen number is %.2f%n", someNumber);
//        results: Hello ,Go!This is not going to appear on a new line
//        add %n to get new line

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String userInput = scanner.nextLine();
//        System.out.printf("Your input was: %s%n", userInput);
//        System.out.println("your input was " + userInput);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userName = scanner.nextLine();
//        System.out.printf("Your name is:  %n%s", userName);

//        System.out.println("enter an integer:");
//        int userInput = scanner.nextInt();
//        System.out.println("you entered: " + userInput);
//
//        String first;
//        String second;
//        System.out.println("please enter a sentence: ");
//        String ghost = scanner.nextLine();
//        first = scanner.nextLine();
//        System.out.println("please eneter another sentence: ");
//        second = scanner.nextLine();
//        System.out.println("First sentence was: " + first + "\nSecond sentence was: " + second);
//        using ghost line to allow both of our inputs to work as intended

//        use nextLine and parse the integer

        System.out.println("enter an integer:");
        int userInput = Integer.parseInt(scanner.nextLine());
        System.out.println("you entered: " + userInput);

        String first;
        String second;
        System.out.println("please enter a sentence: ");
        String ghost = scanner.nextLine();
        first = scanner.nextLine();
        System.out.println("please eneter another sentence: ");
        second = scanner.nextLine();
        System.out.println("First sentence was: " + first + "\nSecond sentence was: " + second);
    }
}
