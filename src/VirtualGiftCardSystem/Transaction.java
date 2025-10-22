package VirtualGiftCardSystem;

import java.time.LocalDateTime;

public class Transaction {
    private int transaction_Id;
    private int cardNumber;
    private int amount;
    private LocalDateTime transactionTime;
    private String paymentMethod;
    private int remainingBalance;
    public Transaction(int transaction_Id, int cardNumber, int amount, LocalDateTime transactionTime, String paymentMethod, int remainingBalance) {
        this.transaction_Id = transaction_Id;
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.transactionTime = transactionTime;
        this.paymentMethod = paymentMethod;
        this.remainingBalance = remainingBalance;
    }

    public int getTransaction_Id() {
        return transaction_Id;
    }


    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAmount() {
        return amount;
    }


    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }


    public int getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(int remainingBalance) {
        this.remainingBalance = remainingBalance;
    }
}
