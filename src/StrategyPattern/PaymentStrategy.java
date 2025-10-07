package StrategyPattern;

public class PaymentStrategy {
    public Payment payment;
   public PaymentStrategy(Payment payment) {
       this.payment = payment;
   }
   public void credit(int amount) {
       payment.credit(amount);
   }
}
