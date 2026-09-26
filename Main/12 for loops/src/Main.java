import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your seconds of countdown: ");
        int seconds = scanner.nextInt();

        for(int i = seconds; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.print("Happy new year");

        scanner.close();
    }
}