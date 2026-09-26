import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n,h,m,s;

        System.out.print("Enter the value of intergers n: ");
        n = scanner.nextInt();

        System.out.print("Enter hours: ");
        h = scanner.nextInt();

        System.out.print("Enter minutes: ");
        m = scanner.nextInt();

        System.out.print("Enter seconds: ");
        s = scanner.nextInt();

        m = (m + (n + s)%3600/60)%60;
        h = (h + (n + s)/3600)%24;
        s = (n + s)%60;

        System.out.println("The valuable of hours, minutes, seconds after n seconds");
        System.out.println(h + " " + m + " " + s);

        scanner.close();
    }
}
