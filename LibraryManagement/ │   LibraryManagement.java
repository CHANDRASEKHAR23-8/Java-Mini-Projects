import java.util.ArrayList;
import java.util.Scanner;

class Book {

    private int bookId;
    private String title;
    private boolean issued;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.issued = false;
    }

    int getBookId() {
        return bookId;
    }

    boolean isIssued() {
        return issued;
    }

    void issueBook() {
        issued = true;
    }

    void returnBook() {
        issued = false;
    }

    void display() {
        String status = issued ? "Issued" : "Available";
        System.out.println("Book ID: " + bookId + " | Title: " + title + " | Status: " + status);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    books.add(new Book(id, title));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available!");
                    } else {
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();

                    boolean issued = false;

                    for (Book b : books) {
                        if (b.getBookId() == issueId && !b.isIssued()) {
                            b.issueBook();
                            issued = true;
                            System.out.println("Book issued successfully!");
                            break;
                        }
                    }

                    if (!issued) {
                        System.out.println("Book not available or already issued!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    boolean returned = false;

                    for (Book b : books) {
                        if (b.getBookId() == returnId && b.isIssued()) {
                            b.returnBook();
                            returned = true;
                            System.out.println("Book returned successfully!");
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Invalid book ID or book not issued!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Library Management System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}


