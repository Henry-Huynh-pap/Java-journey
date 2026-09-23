import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("Enter your full name: ");
        name = scanner.nextLine();

        System.out.print("Your length of your name is: " + name.length());

        scanner.close();
    }
}