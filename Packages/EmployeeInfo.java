// File: MainApp.java
import employee.Employee; // Importing user-defined package
import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, age, salary);
        emp.displayEmployeeInfo();

        scanner.close();
    }
}
