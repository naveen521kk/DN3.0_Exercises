package design_patterns.StrategyPatternExample;

public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create payment strategy instances
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy paypal = new PayPalPayment("john.doe@example.com");

        // Create context with CreditCardPayment strategy
        PaymentContext context = new PaymentContext(creditCard);
        System.out.println("Payment using Credit Card:");
        context.executePayment(100.00);

        // Change strategy to PayPalPayment
        context.setPaymentStrategy(paypal);
        System.out.println("\nPayment using PayPal:");
        context.executePayment(150.00);
    }
}