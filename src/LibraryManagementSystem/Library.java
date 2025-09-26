package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    int book_Id = 1;
    int member_Id = 1;
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();
    public void AddBooks(String book_Title, String book_Author) {
            books.add(new Book(book_Id, book_Title, book_Author));
            book_Id++;
            System.out.println("Book Added Successfully");
    }
    public void AddMembers(String member_Name) {
        members.add(new Member(member_Id, member_Name));
        member_Id++;
        System.out.println("Members Added In Library");
    }
    public void ShowBooks() {
        System.out.println("-------------------------------Library Book Records--------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-15s\n", "Book_Id", "Book_Title", "Book_Author", "Book_Status");
        for(Book book : books) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.printf("%-10d %-20s %-20s %-15b\n", book.getBook_Id(), book.getTitle(), book.getAuthor_Name(), book.isAvailable());
            System.out.println("----------------------------------------------------------------------------------");
        }

    }


}
