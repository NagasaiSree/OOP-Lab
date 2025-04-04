import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int studentID;
    String grade;

    Student(String name, int age, int studentID, String grade) {
        super(name, age);
        this.studentID = studentID;
        this.grade = grade;
    }

    void displayStudentDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        System.out.print("Enter the age: ");
        int age = input.nextInt();

        System.out.print("Enter the Student ID: ");
        int studentID = input.nextInt();
        input.nextLine();  // Consume the leftover newline

        System.out.print("Enter the grade: ");
        String grade = input.nextLine();

        Student student = new Student(name, age, studentID, grade);
        student.displayStudentDetails();

        input.close(); // Close the scanner
    }
}
