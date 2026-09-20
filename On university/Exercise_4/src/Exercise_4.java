import java.util.Scanner;

public class Exercise_4 {
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);

        double R = 0;
        double S = 0;
        double L = 0;
        double PI = 3.14;

        System.out.print("Nhap ban kinh R = ");
        R = scanner.nextDouble();
        S = R*R*PI;
        L = 2*PI*R;
        System.out.println("Dien tich hinh tron : " + L);
        System.out.println("Chu vi hinh tron : " + S);
    }
}








