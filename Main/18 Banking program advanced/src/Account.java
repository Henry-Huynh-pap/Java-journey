public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double amount){

        if(amount < 0){
            throw new IllegalArgumentException("The amount can't be negative");
        }

        balance += amount;
        return balance;
    }

    public double withdraw(double amount){

        if(amount <= 0){
            throw new IllegalArgumentException("The amount can't be negative");
        }
        if(amount > balance){
            throw new IllegalStateException("The amount can't be higher than balance");
        }

        balance -= amount;
        return balance;
    }
}
