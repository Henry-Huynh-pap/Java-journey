import java.util.Scanner;

public class main {
    public static void main(String[] args){

        boolean running = true ;
        int num;
        double balance = 500;

        while(running){
            System.out.println("*************");
            System.out.println("Banking program");
            System.out.println("*************");
            System.out.println("Choose your decision");
            System.out.println("1. Check the balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit the program");
            System.out.print("Enter your decision (first number) : ");
            num = scanner.nextInt();

            switch(num){
                case 1:
                    System.out.println(checkBalance(balance));
                    break;

                case 2:
                    balance += deposit();
                    break;

                case 3:
                    balance -= withdraw(balance);
                    break;

                case 4:
                    System.out.println("See you soon");
                    running = false;
                    break;

                default:
                    System.out.println("The number of decision is undefined");
                    System.out.println("Please do it again");
                    break;
            }
        }

        scanner.close();
    }

    static Scanner scanner = new Scanner(System.in);

    static double checkBalance(double balance){
        System.out.print("Your balance is: $");
        return balance;
    }

    static double deposit(){
        double amount;

        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("The amount is undefined");
            return 0;
        }
        else{
            System.out.println("Deposited: $ " + amount);
            return amount;
        }

    }

    static double withdraw(double balance){
        double amount;

        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount < 0 || amount > balance ){
            System.out.println("The amount is undefined");
            return 0;
        }
        else{
            System.out.println("Withdraw: $ " + amount);
            return amount;
        }
    }

}
