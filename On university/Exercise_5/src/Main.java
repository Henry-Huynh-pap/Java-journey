import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double pi = Math.PI;
        double r = 0;
        double V = 0;
        double S = 0;

        System.out.print("Nhap ban kinh R = ");
        r = scanner.nextDouble();

        V = (4*pi*r*r)/3;
        S = 4*pi*r*r;

        System.out.println("The tich hinh cau = " + V);
        System.out.println("Dien tich hinh tron = " + S);

        scanner.close();
    }
}
