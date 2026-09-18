import java.util.Scanner;

public class circle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double r;
        double area;
        double circumference;
        double volume;

        System.out.print("Enter your radius : ");
        r = scanner.nextDouble();

        area = Math.PI*r*r;
        circumference = 2*Math.PI*r;
        volume = 4.0/3.0*Math.PI*Math.pow(r, 2);

        System.out.printf("The value of area is : %.1f cm^2\n", area);
        System.out.printf("The value of circumference is : %.1f cm\n", circumference);
        System.out.printf("The value of volume is : %.1f cm^3\n", volume);
    }
}
