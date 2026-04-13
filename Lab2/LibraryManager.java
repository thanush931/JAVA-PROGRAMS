package prg2;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book Added Successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                b.displayBook();
            }
        }
    }

    public Book searchBook(String id) {
        for (Book b : books) {
            if (b.getBookId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void deleteBook(String id) {
        Book b = searchBook(id);
        if (b != null) {
            books.remove(b);
            System.out.println("Book deleted.");
        } else {
            System.out.println("Book not found.");
        }
    }
}