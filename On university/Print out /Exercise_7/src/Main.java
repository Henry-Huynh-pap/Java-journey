import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a,b,c,p,s;

        System.out.print("Enter a: ");
        a = scanner.nextDouble();

        System.out.print("Enter b: ");
        b = scanner.nextDouble();

        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        p = (a+b+c)/2;
        s = Math.sqrt(p * (p+a) * (p+b) * (p+c));

        System.out.println("The result is: " + s);

        scanner.close();
    }
}