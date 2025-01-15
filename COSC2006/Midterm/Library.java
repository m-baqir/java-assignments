package COSC2006.Midterm;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void add(Book b) {
        if (books.add(b))
            System.out.println("Book added successfully");
    }

    public void remove(Book b) {
        if (books.remove(b))
            System.out.println("Book removed successfully");
    }

    public boolean find(Book b) {
        if (books.contains(b))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Moby Dick");
        Book book2 = new Book("test");
        Library lib = new Library();
        lib.add(book1);
        lib.add(book2);
        lib.remove(book1);

    }
}
