import java.util.Scanner;

// Base Class: Person
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Intermediate Class: Student (Inheriting from Person)
class Student extends Person {
    int studentID;
    String course;

    public Student(String name, int age, int studentID, String course) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
    }
}

// Intermediate Class: Faculty (Inheriting from Person)
class Faculty extends Person {
    int facultyID;
    String subject;

    public Faculty(String name, int age, int facultyID, String subject) {
        super(name, age);
        this.facultyID = facultyID;
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Subject: " + subject);
    }
}

// Derived Class: GraduateStudent (Inheriting from Student)
class GraduateStudent extends Student {
    String researchTopic;

    public GraduateStudent(String name, int age, int studentID, String course, String researchTopic) {
        super(name, age, studentID, course);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Interface for Professor (since Java does not support multiple inheritance)
interface ProfessorRole {
    void setPublications(int publications);
    void displayProfessorDetails();
}

// Derived Class: Professor (Inheriting from Faculty)
class Professor extends Faculty implements ProfessorRole {
    int publications;

    public Professor(String name, int age, int facultyID, String subject, int publications) {
        super(name, age, facultyID, subject);
        this.publications = publications;
    }

    @Override
    public void setPublications(int publications) {
        this.publications = publications;
    }

    @Override
    public void displayProfessorDetails() {
        super.displayDetails();
        System.out.println("Publications: " + publications);
    }
}

// Hybrid Class: ResearchAssistant (Inheriting from GraduateStudent, Implementing ProfessorRole)
class ResearchAssistant extends GraduateStudent implements ProfessorRole {
    int publications;
    int projectsInvolved;

    public ResearchAssistant(String name, int age, int studentID, String course, String researchTopic, int publications, int projectsInvolved) {
        super(name, age, studentID, course, researchTopic);
        this.publications = publications;
        this.projectsInvolved = projectsInvolved;
    }

    @Override
    public void setPublications(int publications) {
        this.publications = publications;
    }

    @Override
    public void displayProfessorDetails() {
        System.out.println("Publications: " + publications);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Publications: " + publications);
        System.out.println("Projects Involved: " + projectsInvolved);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select Role:");
        System.out.println("1. Graduate Student");
        System.out.println("2. Professor");
        System.out.println("3. Research Assistant");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline

        if (choice == 1) {
            // Graduate Student Input
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            System.out.print("Enter Age: ");
            int age = input.nextInt();
            System.out.print("Enter Student ID: ");
            int studentID = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Enter Course: ");
            String course = input.nextLine();
            System.out.print("Enter Research Topic: ");
            String researchTopic = input.nextLine();

            GraduateStudent gradStudent = new GraduateStudent(name, age, studentID, course, researchTopic);
            System.out.println("\nGraduate Student Details:");
            gradStudent.displayDetails();
        } 
        else if (choice == 2) {
            // Professor Input
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            System.out.print("Enter Age: ");
            int age = input.nextInt();
            System.out.print("Enter Faculty ID: ");
            int facultyID = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Enter Subject: ");
            String subject = input.nextLine();
            System.out.print("Enter Number of Publications: ");
            int publications = input.nextInt();

            Professor professor = new Professor(name, age, facultyID, subject, publications);
            System.out.println("\nProfessor Details:");
            professor.displayProfessorDetails();
        } 
        else if (choice == 3) {
            // Research Assistant Input
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            System.out.print("Enter Age: ");
            int age = input.nextInt();
            System.out.print("Enter Student ID: ");
            int studentID = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Enter Course: ");
            String course = input.nextLine();
            System.out.print("Enter Research Topic: ");
            String researchTopic = input.nextLine();
            System.out.print("Enter Number of Publications: ");
            int publications = input.nextInt();
            System.out.print("Enter Number of Projects Involved: ");
            int projectsInvolved = input.nextInt();

            ResearchAssistant ra = new ResearchAssistant(name, age, studentID, course, researchTopic, publications, projectsInvolved);
            System.out.println("\nResearch Assistant Details:");
            ra.displayDetails();
        } 
        else {
            System.out.println("Invalid Choice!");
        }

       
    }
}
