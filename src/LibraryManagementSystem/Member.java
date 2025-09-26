package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private int member_Id;
    private String member_Name;
    List<Book> borrowedBooks;

    public Member( int member_Id, String member_Name) {
        this.member_Name = member_Name;
        this.member_Id = member_Id;
        this.borrowedBooks = new ArrayList<>();
    }
    public int getMember_Id() {
        return member_Id;
    }
    public String getMember_Name() {
        return member_Name;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void addBooks(Book book) {
        borrowedBooks.add(book);
    }
    public void returnBook(Book returnbook) {
        borrowedBooks.remove(returnbook);
    }
}
