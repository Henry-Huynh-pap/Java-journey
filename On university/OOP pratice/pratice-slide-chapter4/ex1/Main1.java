import java.util.*;

class findMin{

    public double min(double a, double b, double c){
        return Math.min(a, Math.min(b,c) );
    }
}

public class Main1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter a: ");
        a = scanner.nextDouble();

        System.out.print("Enter b: ");
        b = scanner.nextDouble();

        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        findMin minNumber = new findMin();
        System.out.println("The min of the numbers is: " + minNumber.min(a,b,c));

        scanner.close();
    }
}
