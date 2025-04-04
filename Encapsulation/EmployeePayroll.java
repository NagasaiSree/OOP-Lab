class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Setting default as 30000.");
            this.salary = 30000;
        }
    }

    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 50000);
        Employee emp2 = new Employee("Jane Smith", -20000); // Invalid salary

        emp1.showDetails();
        emp2.showDetails();
    }
}
