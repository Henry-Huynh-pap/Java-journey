import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double x,y,numerator,denominator,result;

        System.out.print("Enter x: ");
        x = scanner.nextDouble();

        System.out.print("Enter y: ");
        y = scanner.nextDouble();

        numerator = Math.pow((x*x + y*y), 1/3) * Math.log(x*x + Math.pow(y, 4) + 1 ) / Math.log(5);
        denominator = Math.pow(Math.tan(x+y), 2) + Math.PI/2;

        result = numerator / denominator;

        System.out.print("The value of expression is: " + result);

        scanner.close();
    }
}