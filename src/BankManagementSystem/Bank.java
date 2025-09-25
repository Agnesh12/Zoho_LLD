package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    int account_Id = 1;
    Scanner tempScan = new Scanner(System.in);
    Account account = new Account();
    ArrayList<Account> accounts = new ArrayList<>();
    public void createAccount(String user_Name, String phone_Number, String address) {
        accounts.add(new Account(user_Name, "A" +  String.valueOf(account_Id) + "S" +  String.valueOf(0000) + "K", phone_Number, address, 1000));
        account_Id++;
        System.out.println("Account Created Successfully");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit");
        System.out.println("Enter The User Choice");
        int user_Choice = tempScan.nextInt();
        switch(user_Choice) {
            case 1:
                System.out.println("Enter The Money To Deposit");
                long deposit = tempScan.nextLong();
                depositMoney(deposit);
                break;
            case 2:
                System.out.println("Enter The Money To Withdraw");
                long withdrawMoney = tempScan.nextLong();
                withdrawMoney(withdrawMoney);
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    public void deleteAccount(String account_Id) {
        Account removeAccount = null;
        for(Account account : accounts) {
            if(account.getAccount_Id().equals(account_Id)) {
                removeAccount = account;
                System.out.println("Account Removed Successfully");
            }
        }
        accounts.remove(removeAccount);
    }
    public void showAccounts() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-20s %-10s\n", "Account_Id", "Account Name", "Phone Number", "Address", "Balance");
        System.out.println("------------------------------------------------------------------------------------------");
        for(Account account : accounts) {
            System.out.printf("%-15s %-15s %-15s %-20s %-10d\n", account.getAccount_Id(), account.getName(), account.getPhoneNumber(), account.getAddress(), account.getBalance());
        }
    }
    public boolean depositMoney(long deposit) {
        if(deposit > 0) {
             account.totalBalance(deposit);
            System.out.println("Deposited Successfully");
            return true;
        }
        else {
            System.out.println("Invalid Amount");
            return false;
        }

    }
    public boolean withdrawMoney(long money) {
        if(money > 0 && (money <= account.getBalance())) {
             account.withdraw(money);
            System.out.println("Withdraw Successfully");
            return true;
        }
        else {
            System.out.println("Insufficient Money or Invalid Amount");
            return false;
        }
    }

}
