interface Calculator {
    int add(int a, int b); // Abstract method

        default void showInfo() {
        System.out.println("This is a Calculator Interface.");
    }

        static void showStaticInfo() {
        System.out.println("Static method in Calculator Interface.");
    }
}

class BasicCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Calculation {
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        System.out.println("Addition: " + calc.add(10, 20));

        calc.showInfo(); // Calling default method
        Calculator.showStaticInfo(); // Calling static method
    }
}
