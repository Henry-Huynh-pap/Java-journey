import java.util.Scanner;

public class Main1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double x,numerator, denominator, result;

        System.out.print("Enter the value of x= ");
        x = scanner.nextDouble();

        numerator = Math.pow(x, 3) + Math.log(Math.abs(x-3) + 2) / Math.log(5);
        denominator = Math.pow(Math.atan(x-5),2) + 1;
        result = numerator / denominator;

        System.out.print("Value of the expression is: " + result);

        scanner.close();
    }
}