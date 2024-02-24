package xyz.venuprasath.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}