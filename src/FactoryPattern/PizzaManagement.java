package FactoryPattern;

public class PizzaManagement {
    public static void main(String[] args) {
        PizzaFactory factory = new CheesePizzaFactory();
        Pizza pizza = factory.OrderPlaced();
        pizza.cut();
        pizza.prepare();
        pizza.bake();
        PizzaFactory factory1 = new MuttonPizzaFactory();
        Pizza pizza1 = factory1.OrderPlaced();
        pizza1.cut();
        pizza1.prepare();
        pizza1.bake();
    }
}
