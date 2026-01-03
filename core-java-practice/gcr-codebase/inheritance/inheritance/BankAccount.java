package inheritance;

public class BankAccount {
    int accountNumber;
    double balance;
}
class SavingsAccount extends BankAccount {
    double interestRate;

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}
class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}
