package StrategyPattern;

public class DebitCardPayment implements Payment{
    @Override
    public void credit(int amount) {
        System.out.println(amount + " Rs Paid Through Debit Card");
    }
}
