package MovieReservationSystem;
import java.util.*;
public class ReservationSystem {
    public static void main(String[] args) {
        Scanner tempScan = new Scanner(System.in);
        ReservationManagement management = new ReservationManagement();
        while(true) {
            System.out.println("Welcome To RockStar Theatre");
            System.out.println("1.Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.println("Enter The User Role");
            int userChoice = tempScan.nextInt();
            switch(userChoice) {
                case 1:
                    management.AdminRole();
                    break;
                case 2:
                    management.UserRole();
                    break;
            }
        }
    }
}
