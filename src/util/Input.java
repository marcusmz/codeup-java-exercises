package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Give a yes or no answer: (y/n)");
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt + "(y/n)");
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ":");
        int userInt = scanner.nextInt();
        if(userInt >= min && userInt <= max){
            return userInt;
        } else{
            System.out.println("Input out of range!");
            return getInt(min, max);
        }
    }

    public int getInt(){
        return getInt("enter number:");
    }
    public int getInt(String prompt){
        try {
            String input = getString(prompt);
            return Integer.valueOf(input);
        }catch(NumberFormatException e){
            System.out.println("uh oh this isn't an int");
            return getInt("re-enter number");
        }
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a number between 1 and 10: ");
        double userNum = scanner.nextDouble();
        if(userNum >= min && userNum <= max){
            return userNum;
        } else{
            System.out.println("Input out of range!");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return getDouble("enter number:");
    }

    public double getDouble(String prompt){
        try{
            String input = getString(prompt);
            return Double.valueOf(input);
        }catch(NumberFormatException e){
            System.out.println("That is not a number, try again");
            return getDouble("re-enter number:");
        }

    }
}
