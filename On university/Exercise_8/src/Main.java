import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double result, numerator, denominator, x;

        System.out.print("Enter x: ");
        x = scanner.nextDouble();

        numerator = Math.pow(x*x, 1/3) + Math.pow(x, 5) + Math.log(Math.pow(x,4) + 1);
        denominator = x*x+Math.PI/4;
        result = numerator / denominator;

        System.out.print("Value of the expression is: " + result);

        scanner.close();
    }
}