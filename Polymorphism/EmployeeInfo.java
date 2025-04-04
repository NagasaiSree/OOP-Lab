class Employee {
    String name;
    int id;
    double salary;

    // **Constructor 2: Two parameters**
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 30000;  // Default salary
    }

    // **Constructor 3: Three parameters**
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        // Using different constructors
        Employee emp2 = new Employee("Alice", 101);
        Employee emp3 = new Employee("Bob", 102, 50000);

           System.out.println("Employee 1:");
        emp2.displayEmployeeDetails();

        System.out.println("Employee 2:");
        emp3.displayEmployeeDetails();
    }
}
