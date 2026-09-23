import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a, b, c, s;

        System.out.print("Enter the width: ");
        a = scanner.nextDouble();

        System.out.print("Enter the high: ");
        b = scanner.nextDouble();

        c = (a+b)*2;
        s = a * b;

        System.out.println("The value of rectangle area is: " + s );
        System.out.print("The value of rectangle perimeter is: " + c );

        scanner.close();
    }
}