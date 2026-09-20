import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double L,W,D,C;

        System.out.print("Enter the length: ");
        L = scanner.nextDouble();

        System.out.print("Enter the width: ");
        W = scanner.nextDouble();

        D = L*W;
        C = (L+W)*2;

        System.out.println("Area of a retangle: " + D);
        System.out.println("Perimeter of a retangle: " + C);

        scanner.close();
    }
}