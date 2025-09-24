package FactoryPattern;

public class CheesePizzaFactory implements PizzaFactory{
    @Override
    public Pizza OrderPlaced() {
        return new CheesePizza();
    }
}
