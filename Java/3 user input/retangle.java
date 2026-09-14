import java.util.Scanner;

public class retangle {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter your width: ");
        width = scanner.nextDouble();

        System.out.print("Enter your height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + " cm^2");

        scanner.close();
    }
}
