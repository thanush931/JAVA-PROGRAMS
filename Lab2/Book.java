package prg2;

public class Book {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public void displayBook() {
        System.out.println("\nBook ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}