package encapsulation;

public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String acc, String name, double bal) {
        accountNumber = acc;
        holderName = name;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public abstract double calculateInterest();
}
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan applied");
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}
