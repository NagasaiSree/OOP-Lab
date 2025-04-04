class Area {

    // Method 1: Area of a Square
    double calculateArea(double side) {
        return side * side;
    }

    // Method 2: Area of a Rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Method 3: Area of a Circle
    double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    // Method 4: Area of a Triangle
    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Area areaCalc = new Area();

        // Using method overloading to calculate areas
        System.out.println("Area of Square: " + areaCalc.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + areaCalc.calculateArea(10.0, 5.0));
        System.out.println("Area of Circle: " + areaCalc.calculateArea(7.0f));
        System.out.println("Area of Triangle: " + areaCalc.calculateArea(8.0, 6.0, true));
    }
}
