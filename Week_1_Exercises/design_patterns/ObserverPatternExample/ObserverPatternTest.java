package design_patterns.ObserverPatternExample;

// ObserverPatternTest.java
public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a stock market subject
        StockMarket stockMarket = new StockMarket("AAPL", 150.00);

        // Create observer instances
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Update stock price and notify observers
        System.out.println("Updating stock price...");
        stockMarket.setStockPrice(155.00);

        // Deregister one observer and update stock price
        stockMarket.deregisterObserver(mobileApp);
        System.out.println("Updating stock price again...");
        stockMarket.setStockPrice(160.00);
    }
}
