package design_patterns.ObserverPatternExample;

public class WebApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("WebApp received update: " + stockName + " price is now $" + stockPrice);
    }
}
