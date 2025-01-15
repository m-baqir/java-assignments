package COSC2006.Assignment1;

public class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Book myBook = new Book("Moby Dick");
        System.out.println(myBook.getTitle());
    }
}
