import java.util.Scanner;

public class Main1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double x,y ,numerator,denominator, result;
        
        System.out.print("Enter x: ");
        x = scanner.nextDouble();

        System.out.print("Enter y: ");
        y = scanner.nextDouble();

        numerator = Math.pow(Math.E, x+y) + Math.log(Math.abs(x*x - y) + 5);
        denominator = Math.cos( x +y ) - Math.sin(x) + 3;

        result = numerator / denominator;

        System.out.print("The value of expression is: " + result);

        scanner.close();
    }
}