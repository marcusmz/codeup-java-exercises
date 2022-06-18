//public class HighLow {
//
//    public static boolean printMessage(int guess, int randomNum){
//        boolean willKeepGoing = true;
//        if (guess == randomNum){
//            System.out.println("GOOD GUESS");
//            willKeepGoing = false;
//        }else if (guess < randomNum){
//            System.out.println("HIGHER");
//        } else{
//            System.out.println("LOWER");
//        }
//        return willKeepGoing;
//    }
//
//    public static void runGuesses(int randomNum){
//        System.out.println("Guess a number between 1 and 100");
//        int guess = MethodsExercises.getInteger(1, 100);
//        if (printMessage(guess, randomNum)){  // return a boolean to decide to continue
//            runGuesses(randomNum);
//        }
//    }
//
//    public static void highLow(){
//        System.out.println("Welcome to the High Low game.");
//        int randomNum = MethodsExercises.getRandomInt(1, 100);
//        runGuesses(randomNum);
//
//    }
//
//    public static void main(String[] args) {
//        highLow();
//    }
//}