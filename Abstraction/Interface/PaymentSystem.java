import java.util.Scanner;

interface Payment {
    void makePayment(double amount);
    void checkBalance();
}

class CreditCard implements Payment {
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

       public void makePayment(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Payment of $" + amount + " made using Credit Card.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

       public void checkBalance() {
        System.out.println("Credit Card Balance: $" + balance);
    }
}

class UPI implements Payment {
    private double balance;

    public UPI(double balance) {
        this.balance = balance;
    }

       public void makePayment(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Payment of $" + amount + " made using UPI.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

       public void checkBalance() {
        System.out.println("UPI Wallet Balance: $" + balance);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial Credit Card balance: ");
        double creditCardBalance = scanner.nextDouble();
        
        System.out.print("Enter initial UPI Wallet balance: ");
        double upiBalance = scanner.nextDouble();

        CreditCard creditCard = new CreditCard(creditCardBalance);
        UPI upi = new UPI(upiBalance);

        while (true) {
            System.out.println("\n1. Pay with Credit Card");
            System.out.println("2. Pay with UPI");
            System.out.println("3. Check Credit Card Balance");
            System.out.println("4. Check UPI Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to pay using Credit Card: ");
                double creditAmount = scanner.nextDouble();
                creditCard.makePayment(creditAmount);
            } 
            else if (choice == 2) {
                System.out.print("Enter amount to pay using UPI: ");
                double upiAmount = scanner.nextDouble();
                upi.makePayment(upiAmount);
            } 
            else if (choice == 3) {
                creditCard.checkBalance();
            } 
            else if (choice == 4) {
                upi.checkBalance();
            } 
            else if (choice == 5) {
                System.out.println("Thank you for using the Payment System!");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
