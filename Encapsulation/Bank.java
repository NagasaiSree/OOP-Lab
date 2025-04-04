import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = input.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.println("Final Balance: Rs." + account.getBalance());
        input.close();
    }
}
