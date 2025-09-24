package FactoryPattern;

public class MuttonPizzaFactory implements PizzaFactory{
    @Override
    public Pizza OrderPlaced() {
        return new MuttonPizza();
    }
}
