import java.util.Scanner;

class Payment {
    void processPayment(double amount) {
        System.out.println("Processing a payment of $" + amount);
    }
}

class CreditCard extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Rs." + amount);
    }
}

class PayPal extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of Rs." + amount);
    }
}

// Main class
public class PaymentMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        int choice = input.nextInt();

        System.out.print("Enter amount: Rs.");
        double amount = input.nextDouble();

        Payment paymentMethod; // Base class reference

        if (choice == 1) {
            paymentMethod = new CreditCard();
        } 
        else if (choice == 2) {
            paymentMethod = new PayPal();
        } 
        else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        paymentMethod.processPayment(amount);
        input.close();
    }
}
