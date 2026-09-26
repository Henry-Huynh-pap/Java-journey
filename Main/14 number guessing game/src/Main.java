import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int ran;
        boolean guessing = false;
        int attempt = 5;
        String response;
        int scores = 0;

        ran = random.nextInt(100) + 1;

        System.out.println("The number you have to guess is from 1 to 100 ");
        System.out.println("You have " + attempt + " to try");

        while(!guessing){

            for( int i = 0; i < attempt; i++) {
                System.out.print("Please enter the number you're guessing: ");
                guess = scanner.nextInt();
                scores++;

                if (guess > ran) {
                    System.out.println("Too high");
                } else if (guess < ran) {
                    System.out.println("Too low");
                } else {
                    guessing = true;
                    System.out.println("Correct");
                    System.out.println("Congratulation");
                    System.out.println("you've tried" + scores + " attempts");
                    break;
                }
            }

            System.out.println("You've been limited 5 guess");
            System.out.println("Would you want to try again ? (Yes/no)");
            response = scanner.next();

            if( !response.equalsIgnoreCase("yes")){
                System.out.println("Good luck");
                break;
            }
        }

        scanner.close();
    }
}