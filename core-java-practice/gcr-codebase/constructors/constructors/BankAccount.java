package constructors;

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1001, "Suresh", 5000);
        s.display();
    }
}
