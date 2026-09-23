import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double x,y,numerator,denominator;

        System.out.print("Enter x: ");
        x = scanner.nextDouble();

        System.out.print("Enter y: ");
        y = scanner.nextDouble();

        if( x != -y){
            numerator = Math.pow(x*x,1.0/3) - Math.log(x+y) / Math.log(5);
            denominator = Math.atan(x-y) + Math.PI / 4;

            System.out.print("The value of expression is: " + numerator/denominator);
        }
        else{
            System.out.print("Domain of a ln function");
        }

        scanner.close();
    }
}