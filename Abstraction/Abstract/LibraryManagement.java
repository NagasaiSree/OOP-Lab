import java.util.Scanner;


abstract class Book {
    String title, author;
    int bookID;

    public Book(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    abstract void displayBookInfo();
}

class Fiction extends Book {
    String genre;

    public Fiction(String title, String author, int bookID, String genre) {
        super(title, author, bookID);
        this.genre = genre;
    }

    @Override
    void displayBookInfo() {
        System.out.println("Fiction Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
        System.out.println("Genre: " + genre);
    }
}

class NonFiction extends Book {
    String subject;

    public NonFiction(String title, String author, int bookID, String subject) {
        super(title, author, bookID);
        this.subject = subject;
    }

    @Override
    void displayBookInfo() {
        System.out.println("Non-Fiction Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
        System.out.println("Subject: " + subject);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Fiction Book Details:");
        System.out.print("Title: ");
        String fictionTitle = input.nextLine();
        System.out.print("Author: ");
        String fictionAuthor = input.nextLine();
        System.out.print("Book ID: ");
        int fictionID = input.nextInt();
        input.nextLine();  
        System.out.print("Genre: ");
        String fictionGenre = input.nextLine();

        System.out.println("\nEnter Non-Fiction Book Details:");
        System.out.print("Title: ");
        String nonFictionTitle = input.nextLine();
        System.out.print("Author: ");
        String nonFictionAuthor = input.nextLine();
        System.out.print("Book ID: ");
        int nonFictionID = input.nextInt();
        input.nextLine();  
        System.out.print("Subject: ");
        String nonFictionSubject = input.nextLine();

        Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionID, fictionGenre);
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionID, nonFictionSubject);

         System.out.println("\nBook Information:");
        fictionBook.displayBookInfo();
        System.out.println();
        nonFictionBook.displayBookInfo();

        input.close();
    }
}
