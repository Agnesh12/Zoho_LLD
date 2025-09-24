package ZomotoSystem;
import java.util.*;
public class ZomatoSystem {
    public static void main(String[] args) {
        System.out.println("Zomato System");
        System.out.println("1.Admin");
        System.out.println("2.User");
        System.out.println("Enter the Role");
        Scanner tempScan = new Scanner(System.in);
        int RoleChoice = tempScan.nextInt();
       ZomatoManagement management = new ZomatoManagement();

        switch(RoleChoice) {
            case 1:
                management.AdminRole();
                break;
            case 2:
                management.UserRole();
                break;
            default:
                System.out.println("Invalid Role");
        }

    }
}
