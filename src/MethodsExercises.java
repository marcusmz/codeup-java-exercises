import java.util.Scanner;

//public class MethodsExercises {

//        1.
//    public static int add(int num1, int num2){
//        return num1 + num2;
//    }
//    public static int subtract(int num1, int num2){
//        return num1 - num2;
//    }
//    public static int multiply(int num1, int num2){
//        return num1 * num2;
//    }
//    public static int divide(int num1, int num2){
//        return num1 / num2;
//    }
//    public static int modulus(int num1, int num2){
//        return num1 % num2;
//    }
//    public static int newMulti(int num1, int num2){
//        int newNum = 0;
//        for (int i = 1; i <= num2; i++) {
//             newNum += num1;
//        }
//        return newNum;
//    }

//        2.
//        public static int getInteger(int min, int max){
//            Scanner scanner = new Scanner(System.in);
//            int userInt = scanner.nextInt();
//            if(userInt >= min && userInt <= max){
//                return userInt;
//            } else{
//                System.out.println("Input out of range");
//                return getInteger(min, max);
//            }
//        }

//        3.
//    public static long factorial(int num){
//        long output = 1;
//        for(int i = 1; i <= num; i++){
//            output *= i;
//        }
//        return output;
//    }

//        public static long factorial(int num){
//            if(num == 1) return 1;
//            return factorial(num - 1) * num;
//        }
//        public static void promptUserForFactorials(){
//            Scanner scanner = new Scanner(System.in);
//            String continueMessage;
//            System.out.println("Welcome to the factorial calculator!");
//            do {
//                System.out.println("What number should calculate?");
//                int userInt = getInteger(1,10);
//                System.out.println("The factorial of " + userInt + " is " + factorial(userInt) + ".");
//
//                System.out.println("Would you like to enter another number? (Enter 'yes' or 'no')");
//                continueMessage = scanner.nextLine();
//            }while(continueMessage.equalsIgnoreCase("yes"));
//        }

//        4.
//        public static int getRandomInt(int min, int max){
//            return min + (int)(Math.random() * ((max - min) + 1));
//        }
//
//        public static void diceRoll(){
//            System.out.println("Welcome to dice roll");
//            System.out.println("Enter number of sides of dice. (1-6)");
//            int numOfSides = getInteger(1, 6);
//            System.out.printf("You have rolled %d and a %d",
//                    getRandomInt(1, numOfSides),
//                    getRandomInt(1, numOfSides));
//        }
//
//}
