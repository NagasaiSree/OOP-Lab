import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

       Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class BookManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter Book Title:");
        String title = input.nextLine();

        System.out.println("Enter Author Name:");
        String author = input.nextLine();

        System.out.println("Enter Price:");
        double price = input.nextDouble();

        // Creating object using **parameterized constructor**
        Book myBook = new Book(title, author, price);

        // Displaying book details
        System.out.println("\nBook Details:");
        myBook.displayBookDetails();

        input.close();
    }
}
