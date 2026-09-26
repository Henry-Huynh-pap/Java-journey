import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter your day: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday","Wednesday","Thursday", "Friday"
                    -> System.out.print("It is a weekday");
            case "Saturday", "Sunday"
                -> System.out.print("It is a weekend");
            default
                    -> System.out.print(day + " is not a day");
        }

        scanner.close();
    }
}