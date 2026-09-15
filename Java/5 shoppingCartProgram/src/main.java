import java.util.Scanner;

public class main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        double price = 0 ;
        char currency = '$';
        int quantity = 0;
        double total = 0;

        System.out.print("Enter the food you want to buy : ");
        name = scanner.nextLine();

        System.out.print("How much would you want to buy ? : " );
        price = scanner.nextDouble();

        System.out.print("Choose your quantity : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + name);
        System.out.print("The total of the "+ name + " is " + currency + total );

        scanner.close();
    }
}
