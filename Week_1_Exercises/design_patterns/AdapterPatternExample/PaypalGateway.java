package design_patterns.AdapterPatternExample;

public class PaypalGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}
