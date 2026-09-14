import java.util.Scanner;

public class dia {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("Hello " + name);

        scanner.close();
    }
}
