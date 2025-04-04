abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void work(); }

// Manager class
class Manager extends Employee {
    Manager(String name, int id) {
        super(name, id);
    }

    void work() {
        System.out.println("Manager " + name + " is managing the team.");
    }
}

class Developer extends Employee {
    Developer(String name, int id) {
        super(name, id);
    }

    void work() {
        System.out.println("Developer " + name + " is writing code.");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101);
        Employee developer = new Developer("Bob", 102);

        manager.work();
        developer.work();
    }
}
