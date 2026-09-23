import java.util.Scanner;

public class Main1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double x,y,numerator,denominator;

        System.out.print("Enter x: ");
        x = scanner.nextDouble();

        System.out.print("Enter y: ");
        y = scanner.nextDouble();

        if( x*x != y){
            numerator = Math.exp(x+y) + Math.log(x*x -y);
            denominator = Math.cos(x+y) + Math.sin(x);

            System.out.print("The value of expression = " + numerator/denominator);
        }
        else{
            System.out.print(" Domain of the ln function");
        }

        scanner.close();
    }
}