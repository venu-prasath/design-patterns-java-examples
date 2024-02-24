package xyz.venuprasath.structural.decorator;

public class DecoratorClient {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " Cost: $" + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + " Cost: $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(sugarMilkCoffee.getDescription() + " Cost: $" + sugarMilkCoffee.cost());
    }
}
