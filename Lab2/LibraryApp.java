package prg2;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    manager.addBook(new Book(id, title, author));
                    break;

                case 2:
                    manager.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    String searchId = scanner.nextLine();
                    Book b = manager.searchBook(searchId);
                    if (b != null)
                        b.displayBook();
                    else
                        System.out.println("Book not found.");
                    break;

                case 4:
                    System.out.print("Enter Book ID to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteBook(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
