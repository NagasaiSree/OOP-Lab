class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println("Interest Earned: " + interest);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("123456789", "Alice", 5000, 5);
        account.deposit(2000);
        account.withdraw(1000);
        account.calculateInterest();
    }
}
