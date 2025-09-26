package LibraryManagementSystem;

public class Book {
    private int book_Id;
    private String title;
    private String author_Name;
    private boolean isAvailable;

    public Book(int book_Id, String title, String author_Name) {
        this.book_Id = book_Id;
        this.title = title;
        this.author_Name = author_Name;
        this.isAvailable = true;
    }

    public int getBook_Id() {
        return book_Id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor_Name() {
        return author_Name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
