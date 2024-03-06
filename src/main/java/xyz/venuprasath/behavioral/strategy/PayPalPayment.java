package xyz.venuprasath.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String emailId;

    public PayPalPayment(String email) {
        this.emailId = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}