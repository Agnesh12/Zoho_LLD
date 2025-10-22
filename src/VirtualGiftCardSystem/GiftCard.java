package VirtualGiftCardSystem;

import java.util.ArrayList;
import java.util.List;

 public class GiftCard {
    static private int cardNumber;
    static private int balance;
    static private String status;
    static List<Transaction> transactions;
    public GiftCard() {}
    public GiftCard(int cardNumber, int balance, String status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.status = status;
        transactions = new ArrayList<>();
    }

    public int getCardNumber() {
        return cardNumber;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    static public void makeTransaction(int amount) {
        int transactionId = 1;
        balance = balance - amount;
        // transactions.add(new Transaction(transactionId++, 1234, amount, ));
        return;
    }
}
