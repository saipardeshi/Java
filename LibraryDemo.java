import java.util.Scanner;

interface Borrowable {
    void borrowBook();
    void returnBook();
}

abstract class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public abstract String getBookType();

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Type: " + getBookType());
    }
}

class EBook extends Book implements Borrowable {
    private double fileSizeMB;
    private boolean isAvailable = true;

    public EBook(String title, String author, String isbn, double fileSizeMB) {
        super(title, author, isbn);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getBookType() {
        return "E-Book";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSizeMB + " MB");
    }

    @Override
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(getTitle() + " has been borrowed.");
        } else {
            System.out.println(getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook() {
        isAvailable = true;
        System.out.println(getTitle() + " has been returned.");
    }
}

class PrintedBook extends Book implements Borrowable {
    private int pageCount;
    private boolean isAvailable = true;

    public PrintedBook(String title, String author, String isbn, int pageCount) {
        super(title, author, isbn);
        this.pageCount = pageCount;
    }

    @Override
    public String getBookType() {
        return "Printed Book";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count: " + pageCount);
    }

    @Override
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(getTitle() + " has been borrowed.");
        } else {
            System.out.println(getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook() {
        isAvailable = true;
        System.out.println(getTitle() + " has been returned.");
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new EBook("Clean Code", "Robert Martin", "E001", 4.5);
        books[1] = new PrintedBook("Effective Java", "Joshua Bloch", "P001", 412);

        System.out.println("----- Library Catalog -----");
        for (Book b : books) {
            b.displayInfo();
            System.out.println();
        }

        System.out.println("----- Borrowing Test -----");
        EBook ebook = (EBook) books[0];
        ebook.borrowBook();
        ebook.borrowBook();
        ebook.returnBook();
        ebook.borrowBook();
    }
}