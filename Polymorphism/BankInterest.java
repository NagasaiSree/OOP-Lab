// Base class
class Bank {
    // Method to get the interest rate
    double getInterestRate() {
        return 0.0;  // Default interest rate
    }
}

// Subclass 1: SBI Bank
class SBI extends Bank {
    // Overriding the getInterestRate method
    @Override
    double getInterestRate() {
        return 4.5;  // SBI offers 4.5% interest
    }
}

// Subclass 2: HDFC Bank
class HDFC extends Bank {
    // Overriding the getInterestRate method
    @Override
    double getInterestRate() {
        return 5.2;  // HDFC offers 5.2% interest
    }
}

// Subclass 3: ICICI Bank
class ICICI extends Bank {
    // Overriding the getInterestRate method
    @Override
    double getInterestRate() {
        return 4.8;  // ICICI offers 4.8% interest
    }
}

// Main class to test method overriding
public class BankInterest {
    public static void main(String[] args) {
        Bank bank;  // Reference of superclass

        // Creating objects of different banks
        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate() + "%");

        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getInterestRate() + "%");

        bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getInterestRate() + "%");
    }
}
