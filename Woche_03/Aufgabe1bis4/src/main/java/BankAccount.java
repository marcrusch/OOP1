public class BankAccount {
    private final long accountNumber;
    private double balance;
    public BankCustomer bankCustomer;
    public BankAccount(long accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }
    public boolean deposit(double amount) {
        if(amount < 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }
    public boolean withdraw(double amount) {
        if(amount >=0 && this.balance-amount<0) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
}
