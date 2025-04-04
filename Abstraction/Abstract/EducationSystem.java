abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void role();
}
class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void role() {
        System.out.println(name + " is a student studying " + course + ".");
    }
}


class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void role() {
        System.out.println(name + " is a teacher teaching " + subject + ".");
    }
}

class Principal extends Teacher {
    Principal(String name, int age, String subject) {
        super(name, age, subject);
    }

    void role() {
        System.out.println(name + " is the principal of the school and oversees all operations.");
    }
}

public class EducationSystem {
    public static void main(String[] args) {
        Person student = new Student("John", 20, "Computer Science");
        Person teacher = new Teacher("Mrs. Smith", 40, "Mathematics");
        Person principal = new Principal("Dr. Brown", 55, "Administration");

        student.role();
        teacher.role();
        principal.role();
    }
}
