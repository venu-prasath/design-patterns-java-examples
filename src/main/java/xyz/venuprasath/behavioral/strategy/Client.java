package xyz.venuprasath.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("1234", 10));
        cart.addItem(new Item("5678", 40));

        cart.setPaymentStrategy(new PayPalPayment("myemail@example.com"));
        cart.checkout();

        cart.setPaymentStrategy(new CreditCardPayment("John Doe", "1234567890123456"));
        cart.checkout();
    }
}
