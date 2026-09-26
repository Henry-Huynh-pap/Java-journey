import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double largeBase, smallBase, height, area;

        System.out.print("Enter the length of a large base: ");
        largeBase = scanner.nextDouble();

        System.out.print("Enter the length of a small base: ");
        smallBase = scanner.nextDouble();

        System.out.print("Enter the length of a height: ");
        height = scanner.nextDouble();

        area = ((largeBase + smallBase) * height) / 2;

        System.out.print("The area of a trapezoid is: " + area);
        scanner.close();
    }
}
