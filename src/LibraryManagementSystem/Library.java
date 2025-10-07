package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    int book_Id = 1;
    int member_Id = 1;
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();
    public Library() {
        books.add(new Book(book_Id, "PsychologyOfMoney", "MorganHousel"));
        book_Id++;
        books.add(new Book(book_Id, "Ikigai", "HectorGarcia"));
        book_Id++;
        books.add(new Book(book_Id, "DeepWork", "CalNewport"));
        book_Id++;
        books.add(new Book(book_Id, "RichDadPoorDad", "RobertKiyosaki"));
        book_Id++;
        books.add(new Book(book_Id, "TheAlchemist", "PauloCoelho"));
        book_Id++;
        books.add(new Book(book_Id, "ThinkAndGrowRich", "NapoleonHill"));
        book_Id++;
        books.add(new Book(book_Id, "Sapiens", "YuvalNoahHarari"));
        book_Id++;
        books.add(new Book(book_Id, "TheSubtleArtOfNotGivingAF*ck", "MarkManson"));
        book_Id++;
        books.add(new Book(book_Id, "TheIntelligentInvestor", "BenjaminGraham"));
        book_Id++;

    }
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
        System.out.printf("%-10s %-25s %-20s %-15s\n", "Book_Id", "Book_Title", "Book_Author", "Book_Status");
        System.out.println("----------------------------------------------------------------------------------");
        for(Book book : books) {

            System.out.printf("%-10d %-20s %-20s %-15b\n", book.getBook_Id(), book.getTitle(), book.getAuthor_Name(), book.isAvailable());
            System.out.println("----------------------------------------------------------------------------------");
        }

    }
    public Book SearchByTitle(String bookTitle) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        return null;
    }
    public Book SearchByAuthor(String author_Name) {
        for(Book book : books) {
            if(book.getAuthor_Name().equalsIgnoreCase(author_Name)) {
                return book;
            }
        }
        return null;
    }




}
