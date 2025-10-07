package StrategyPattern;

public class PaymentGateway {
    public static void main(String[] args) {
        DebitCardPayment debit = new DebitCardPayment();
        PaymentStrategy pattern1 = new PaymentStrategy(debit);
        pattern1.credit(1000);
        OnlinePayment online = new OnlinePayment();
        PaymentStrategy pattern2 = new PaymentStrategy(online);
        pattern2.credit(2000);
    }
}
