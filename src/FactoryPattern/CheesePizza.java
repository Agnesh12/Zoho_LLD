package FactoryPattern;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza Preparing");
    }
    @Override
    public void cut() {
        System.out.println("Cheese Pizza Cutter");
    }
    @Override
    public void bake() {
        System.out.println("Cheese Pizza Baker");
    }
}
