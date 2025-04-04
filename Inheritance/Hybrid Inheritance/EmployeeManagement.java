import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeID;
    String department;

    public Employee(String name, int age, int employeeID, String department) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int age, int employeeID, String department, int teamSize) {
        super(name, age, employeeID, department);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        displayPersonDetails();  // Display name and age
        displayEmployeeDetails(); // Display employee ID and department
        System.out.println("Team Size: " + teamSize);
    }
}

class Engineer extends Employee {
    String specialization;

    public Engineer(String name, int age, int employeeID, String department, String specialization) {
        super(name, age, employeeID, department);
        this.specialization = specialization;
    }

    public void displayEngineerDetails() {
        displayPersonDetails();
        displayEmployeeDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class TechnicalManager extends Manager {
    int projectsHandled;

    public TechnicalManager(String name, int age, int employeeID, String department, int teamSize, int projectsHandled) {
        super(name, age, employeeID, department, teamSize);
        this.projectsHandled = projectsHandled;
    }

    public void displayTechnicalDetails() {
        displayManagerDetails(); // Calls Manager details
        System.out.println("Projects Handled: " + projectsHandled);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("If Manager, press 1.");
        System.out.println("If Engineer, press 2.");
        System.out.println("If Technical Manager, press 3.");

        int x = input.nextInt();
        input.nextLine(); // Consume newline

        if (x == 1) {
            System.out.println("Enter Manager's name:");
            String name = input.nextLine();
            System.out.println("Enter Age:");
            int age = input.nextInt();
            System.out.println("Enter Employee ID:");
            int ID = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.println("Enter Department:");
            String department = input.nextLine();
            System.out.println("Enter Team Size:");
            int teamSize = input.nextInt();

            Manager manager = new Manager(name, age, ID, department, teamSize);
            System.out.println("\nManager Details:");
            manager.displayManagerDetails();  // Fixed: Now displays name, age, ID, department, and team size

        } else if (x == 2) {
            System.out.println("Enter Engineer's name:");
            String name = input.nextLine();
            System.out.println("Enter Age:");
            int age = input.nextInt();
            System.out.println("Enter Employee ID:");
            int ID = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.println("Enter Department:");
            String department = input.nextLine();
            System.out.println("Enter Specialization:");
            String specialization = input.nextLine();

            Engineer engineer = new Engineer(name, age, ID, department, specialization);
            System.out.println("\nEngineer's Details:");
            engineer.displayEngineerDetails();

        } else {
            System.out.println("Enter Technical Manager's name:");
            String name = input.nextLine();
            System.out.println("Enter Age:");
            int age = input.nextInt();
            System.out.println("Enter Employee ID:");
            int ID = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.println("Enter Department:");
            String department = input.nextLine();
            System.out.println("Enter Team Size:");
            int teamSize = input.nextInt();
            System.out.println("Enter Projects Handled:");
            int projectsHandled = input.nextInt();

            TechnicalManager techManager = new TechnicalManager(name, age, ID, department, teamSize, projectsHandled);
            System.out.println("\nTechnical Manager Details:");
            techManager.displayTechnicalDetails();
        }
        input.close();
    }
}
