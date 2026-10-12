import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account(101, "Alex",5000);
        Account account2 = new Account(102, "Felix",7000);
        Account account3 = new Account(103, "Lena",9000);

        HashMap<Integer,Account> library = new HashMap<>();

        library.put(account1.getAccountNumber(),account1);
        library.put(account2.getAccountNumber(),account2);
        library.put(account3.getAccountNumber(),account3);

        System.out.print("Enter your account number: ");
        int accnum = scanner.nextInt();

        Account found = library.get(accnum);

        if(found != null){
            System.out.println("Name: " + found.getAccountHolder());
            System.out.println("Balance: " + found.getBalance());
        }
        else{
            System.out.println("Account not found");
        }

        scanner.close();
    }
}