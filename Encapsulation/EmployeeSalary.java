import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    // Setter methods to assign values
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Invalid Age! Setting default age as 18.");
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary! Setting default salary as $30000.");
            this.salary = 30000;
        }
    }

    // Getter methods to retrieve values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();
        emp.setName(name);

        System.out.print("Enter Employee Age: ");
        int age = input.nextInt();
        emp.setAge(age);

        System.out.print("Enter Employee Salary: ");
        double salary = input.nextDouble();
        emp.setSalary(salary);

        // Display Employee Details using getter methods
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: Rs" + emp.getSalary());

        input.close();
    }
}
