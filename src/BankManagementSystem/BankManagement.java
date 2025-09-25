package BankManagementSystem;
import java.util.*;
public class BankManagement {
    public static void main(String[] args) {
        Scanner tempScan = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("==================Bank Management System======================");
        while(true) {
            System.out.println("-------------Welcome To Bank Management---------------------");
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Show Accounts");
            System.out.println("4. Exit");
            System.out.println("Enter The User Choice");
            int user_Choice = tempScan.nextInt();
            switch(user_Choice) {
                case 1:
                    System.out.println("Enter The User Name");
                    String userName = tempScan.next();
                    System.out.println("Enter The Phone Number");
                    String phone_Number = tempScan.next();
                    System.out.println("Enter The Address");
                    String address = tempScan.next();
                    bank.createAccount(userName, phone_Number, address);
                    break;
                case 2:
                    System.out.println("Enter The Account Id To Delete");
                    String account_id = tempScan.next();
                    bank.deleteAccount(account_id);
                    break;
                case 3:
                    bank.showAccounts();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
