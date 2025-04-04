interface Payment {
    void processPayment(double amount);
}


class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }
}


class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }
}


class UpiPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of $" + amount);
    }
}


public class ECommercePayment {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();
        Payment payment3 = new UpiPayment();

        payment1.processPayment(150.75);
        payment2.processPayment(200.50);
        payment3.processPayment(99.99);
    }
}
