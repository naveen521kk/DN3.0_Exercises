package design_patterns.StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using PayPal.");
        // Simulate payment processing
    }
}