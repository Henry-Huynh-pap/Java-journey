import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        double principal;
        double amount;
        double rate;
        int year;
        int timesCompound;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of years : ");
        year = scanner.nextInt();

        System.out.print("Enter the # of the timeCompound per year: ");
        timesCompound = scanner.nextInt();

        amount = principal*Math.pow( 1+ rate/timesCompound, timesCompound*year);

        System.out.println("The amount is : " + amount);

        scanner.close();
    }
}