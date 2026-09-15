import java.util.Scanner;

public class madLibsGame {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun;
        String verb;
        String adjective2;

        System.out.print("Enter an adjective (your mood): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (a place): ");
        noun = scanner.nextLine();
        System.out.print("Enter a verb (v-ing): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective2 (your mood): ");
        adjective2 = scanner.nextLine();

        System.out.println("Today I was " + adjective1 );
        System.out.println("So I went to " + noun );
        System.out.println("After that I saw a man " + verb + " in the " + noun);
        System.out.print("I was so " + adjective2);

        scanner.close();

    }
}
