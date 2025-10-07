package StrategyPattern;

public class OnlinePayment implements Payment{
    @Override
    public void credit(int amount) {
        System.out.println(amount + " Rs paid Through Online Payment");
    }
}
