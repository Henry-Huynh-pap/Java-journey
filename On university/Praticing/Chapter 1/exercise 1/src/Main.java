import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double n, radian;

        System.out.print("Enter the degree of an angle: ");
        n = scanner.nextDouble();

        radian = n * Math.PI/180;

        System.out.printf("The result of the sine expression is: %.2f%n" ,Math.sin(radian));
        System.out.printf("The result of the cosine expression is: %.2f%n", Math.cos(radian));

        scanner.close();
    }
}
