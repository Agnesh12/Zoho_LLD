package VirtualGiftCardSystem;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customer_Id;
    private String customerName;
    private String customerEmail;
    private long customer_Number;
    static List<GiftCard> giftCards;

    public Customer(int customer_Id, String customerName, String customerEmail, long customer_Number) {
        this.customer_Id = customer_Id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customer_Number = customer_Number;
        this.giftCards = new ArrayList<>();
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public long getCustomer_Number() {
        return customer_Number;
    }
    public List<GiftCard> getGiftCards() {
        return giftCards;
    }
    public void addGiftCard(GiftCard card) {
        giftCards.add(card);
    }

    public void setCustomer_Number(long customer_Number) {
        this.customer_Number = customer_Number;
    }
}
