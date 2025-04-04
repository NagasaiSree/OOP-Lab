interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}
class SavingsAccount implements BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " in Savings Account. New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from Savings Account. New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }
}
class CurrentAccount implements BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " in Current Account. New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from Current Account. New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in Current Account!");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount current = new CurrentAccount();

        savings.deposit(1000);
        savings.withdraw(500);

        current.deposit(2000);
        current.withdraw(2500);
    }
}
