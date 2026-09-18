import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double a ;
        double b;
        double c;

        System.out.print("Enter the value of a is : ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of b is : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b , 2));

        System.out.print("The value of c is : " + c);

        scanner.close();
    }
}