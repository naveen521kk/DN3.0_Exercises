package design_patterns.AdapterPatternExample;

// AdapterPatternTest.java
public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of payment gateways
        PaypalGateway paypalGateway = new PaypalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for the payment gateways
        PaymentProcessor paypalAdapter = new PaypalAdapter(paypalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        // Use the adapters to process payments
        paypalAdapter.processPayment(150.00);
        stripeAdapter.processPayment(200.00);
    }
}
