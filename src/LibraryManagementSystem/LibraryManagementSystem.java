package LibraryManagementSystem;
import java.util.*;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner tempScan = new Scanner(System.in);
        while(true) {
            System.out.println("=========================Library Management System====================================");
            System.out.println("1. Add Books");
            System.out.println("2. Add Members");
            System.out.println("3. Show All Books");
            System.out.println("4. Search Book By Title");
            System.out.println("5. Search Book By Author");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Show Borrowed Books");
            System.out.println("9. Exit");
            System.out.println("Enter The User Choice");
            int userChoice = tempScan.nextInt();
            switch(userChoice) {
                case 1:

                    System.out.println("Enter The Book Title");
                    String book_Title = tempScan.next();
                    System.out.println("Enter The Book Author");
                    String book_Author = tempScan.next();
                    library.AddBooks(book_Title, book_Author);
                    break;
                case 2:
                    System.out.println("Enter The Member Name");
                    String member_Name = tempScan.next();
                    library.AddMembers(member_Name);
                    break;
                case 3:
                    library.ShowBooks();
                    break;
                case 4:
                   // library.SearchByTitle();
                    break;
                case 5:
                   // library.SearchByAuthor();
                    break;
                case 6:
                   // library.IssueBook();
                    break;
                case 7:
                   // library.ReturnBook();
                    break;
                case 8:
                   // library.BorrowedBooks();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choices Choose Different Choice");
            }
        }
    }
}
