import java.util.Scanner;

public class user_Input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double GPA = scanner.nextDouble();

        System.out.print("Are you a student (true/false) : ");
        boolean student = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your name is " + age);
        System.out.println("Your GPA is: " + GPA);

        if(student){
            System.out.println("You are a student");
        }
        else {
            System.out.println("You aren't a student");
        }

        scanner.close();
    }
}
