package VirtualGiftCardSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftSystem {
    Scanner tempScan = new Scanner(System.in);
    List<Customer> customers;
    public GiftSystem() {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Arun Kumar", "arun.kumar@example.com", 876543210));
        customers.add(new Customer(2, "Priya Sharma", "priya.sharma@example.com", 876501234));
        customers.add(new Customer(3, "Vikram Singh", "vikram.singh@example.com", 812345678));
        customers.add(new Customer(4, "Sneha Reddy", "sneha.reddy@example.com", 898765432));
        customers.add(new Customer(5, "Rahul Mehta", "rahul.mehta@example.com", 900123456));
    }
    public void DisplayAccountDetails() {
        System.out.println("Customer Details");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-25s %-20s\n","Customer_Id", "Customer_Name", "CustomerEmail", "CustomerNumber");
        System.out.println("--------------------------------------------------------------------------------------");
        for(Customer customer : customers) {
            System.out.printf("%-15d %-20s %-25s %-20d\n", customer.getCustomer_Id(), customer.getCustomerName(), customer.getCustomerEmail(), customer.getCustomer_Number());
            System.out.println("----------------------------------------------------------------------------------");
        }
    }
    public void CardDetailsSummary(int customer_Id) {
        Customer customer = null;
        for(Customer customer1 : customers) {
            if(customer1.getCustomer_Id() == customer_Id) {
                customer = customer1;
                break;
            }
        }
        if(customer == null) {
            System.out.println("Customer Not Found");
            return;
        }
        customer.addGiftCard(new GiftCard(1, 3000, "Active"));
        List<GiftCard> cards = customer.getGiftCards();
        if(cards.isEmpty()) {
            System.out.println("This Customer Does Not Have Gift Cards");
            return;
        }
        else {
            System.out.println("--------------Gift Cards----------------");
            System.out.println("----------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s\n", "Card Number", "Balance", "Status");
            System.out.println("----------------------------------------------------------");
            for(GiftCard card : cards) {
                System.out.printf("%-15d %-15d %-15s\n", card.getCardNumber(), card.getBalance(), card.getStatus());
                System.out.println("----------------------------------------------------------");
            }
        }
    }
    public void TransactionDetails(int customerId) {
        Customer currentCustomer = null;
        for(Customer customer : customers) {
            if(customer.getCustomer_Id() == customerId) {
                currentCustomer= customer;
                break;
            }
        }
        if(currentCustomer == null) {
            System.out.println("Customer Not Found");
            return;
        }
        System.out.println("Enter The Gift Card Id");
        int cardId = tempScan.nextInt();
        GiftCard currentCard = null;
        for(GiftCard giftCard : Customer.giftCards) {
            if(giftCard.getCardNumber() == cardId) {
                currentCard = giftCard;
                break;
            }
        }
        if(currentCard == null) {
            System.out.println("Gift Card Not Found");
            return;
        }
        System.out.println("Enter The Choice");
        System.out.println("1.Make A Transaction");
        System.out.println("2. Show Transaction");
        System.out.println("Enter The User Choice");
        int userChoice = tempScan.nextInt();
        switch(userChoice) {
            case 1:
                System.out.println("Enter The Amount");
                int amount = tempScan.nextInt();
                GiftCard.makeTransaction(amount);
                break;
            case 2:
                showTransaction(currentCard);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }


    }
    public void showTransaction(GiftCard currentCard) {
        System.out.println("-------------------------------Gift Card Transaction Details-----------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-20s %-20s %-15s\n", "TransactionId", "Card Number", "Amount", "Transaction Time", "Payment Method", "Balance");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(Transaction transaction : currentCard.transactions) {
            System.out.printf("%-15d %-15d %-10d %-20d %-20s %-15d\n", transaction.getTransaction_Id(), transaction.getCardNumber(),transaction.getAmount() , transaction.getTransactionTime(), transaction.getPaymentMethod(), transaction.getRemainingBalance());
            System.out.println("-----------------------------------------------------------------------------------------------");
        }
    }
}
