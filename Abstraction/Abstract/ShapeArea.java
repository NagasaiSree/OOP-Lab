abstract class Shape {
    abstract void area(); // Abstract method
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.area();
        rectangle.area();
    }
}
