import java.util.*;

public class dia {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int scores = 0;
        boolean guessingCorrectly = false;
        int tries = 5;
        int guess;
        int ran;
        String response;

        ran = random.nextInt(100) + 1;

        System.out.println("You have to guess from number 1 to 100");
        System.out.println("You have " + tries + " tries to guess" );

        while(!guessingCorrectly){
            for(int i =0; i < tries; i++ ){

                System.out.print("Enter the number you guess: ");
                guess = scanner.nextInt();
                scores++;

                if(guess == ran){
                    System.out.println("Correct");
                    System.out.println("Congratulation");
                    guessingCorrectly = true;
                    break;
                }
                else if(guess > ran){
                    System.out.println("Too high");
                }
                else{
                    System.out.println("Too low");
                }
            }

            if(!guessingCorrectly) {

                System.out.println("You've reached your limit of trying");
                System.out.println("Would you want to try again ? (Yes/No)");
                System.out.print("Enter your answer: ");
                response = scanner.next();

                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println("Good luck");
                    break;
                }
            }
        }

        System.out.println("You've tried for " + scores + " times");

        scanner.close();
    }
}
