package MovieReservationSystem;
import java.util.*;
import java.util.ArrayList;

public class ReservationManagement {
    Scanner  tempScan = new Scanner(System.in);
    String AdminName = "Admin";
    String password = "Admin123";
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Ticket> tickets = new ArrayList<>();
    public void AdminRole() {
        System.out.println("Enter The Admin Name");
        String adminName = tempScan.next();
        System.out.println("Enter The Admin Password");
        String adminPassword = tempScan.next();
        if(AdminName.equalsIgnoreCase(adminName) && password.equalsIgnoreCase(adminPassword)) {
            System.out.println("Welcome The Admin Role");
            AdminPage();
        }

    }
    public void UserRole() {
        System.out.println("Enter The User Id");
        int user_Id = tempScan.nextInt();
        System.out.println("Enter The User Name");
        String userName = tempScan.next();
        System.out.println("Enter The User Password");
        String password = tempScan.next();
        User checkUser = new User(user_Id, userName, password);
        if(users.contains(checkUser)) {
            System.out.println("User Logged In");
        }

        else {
            users.add(checkUser);
            System.out.println("User Created and Logged In");
        }

    }
    public void AdminPage() {

        while(true) {
            System.out.println("Welcome To Admin Page");
            System.out.println("1.Add Tickets");
            System.out.println("2. Remove Tickets");
            System.out.println("3. Display All Members");
            System.out.println("4. Display All Audience");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice");
            int userChoice = tempScan.nextInt();
            switch(userChoice) {
                case 1:
                    //AddTickets();
                    break;
                case 2:
                   // RemoveTickets();
                    break;
                case 3:
                   // DisplayTickets();
                    break;
                case 4:
                   // DisplayAudience();
                    break;
                case 5:
                    System.out.println("Exiting.......");
                    System.exit(0);
            }
        }
    }
    public void UserPage() {
        while(true) {
            System.out.println("Welcome To User Page");
            System.out.println("1.Book Ticket");
            System.out.println("2.Exit");
            
        }
    }

}
