import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a,b,c,delta;

        System.out.println("Solve the quadratic equation");

        System.out.print("Enter a: ");
        a = scanner.nextDouble();

        System.out.print("Enter b: ");
        b = scanner.nextDouble();

        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        delta = b*b-4*a*c;

        if( delta > 0){
            System.out.println("The equation has two distinct real roots");
            System.out.printf("The root x1 = %.2f%n", (-b - Math.sqrt(delta)) / 2*a);
            System.out.printf("The root x2 = %.2f%n" , (-b + Math.sqrt(delta)) / 2*a);
        }
        else if(delta == 0){
            System.out.printf("The equation has a double root x1=x2= %.2f", -b/2*a);
        }
        else{
            System.out.print("The equation has no roots");
        }

        scanner.close();
    }
}
