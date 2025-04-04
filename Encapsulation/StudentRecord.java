import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int rollNumber;

    public void setStudentDetails(String name, int age, int rollNumber) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age. Setting default as 18.");
            this.age = 18;
        }
        this.rollNumber = rollNumber;
    }

    public void getStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        
        System.out.print("Enter student age: ");
        int age = input.nextInt();
        
        System.out.print("Enter roll number: ");
        int rollNumber = input.nextInt();

        Student student = new Student();
        student.setStudentDetails(name, age, rollNumber);
        
        System.out.println("\nStudent Details:");
        student.getStudentDetails();

        input.close();
    }
}
