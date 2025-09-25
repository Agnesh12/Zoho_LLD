package BankManagementSystem;

public class Account {

    private String name;
    private  String account_Id;
    private String phoneNumber;
    private String address;
    private long balance;
    public Account() {

    }
    public Account( String name, String account_Id, String phoneNumber, String address, long balance) {

        this.name = name;
        this.account_Id = account_Id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount_Id() {
        return account_Id;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getBalance() {
        return balance;
    }
    public void totalBalance(long money) {
        this.balance += money;
    }
    public  void withdraw(long money) {
        this.balance -= money;
    }


}
