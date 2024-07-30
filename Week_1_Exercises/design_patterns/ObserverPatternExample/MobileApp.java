package design_patterns.ObserverPatternExample;

public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("MobileApp received update: " + stockName + " price is now $" + stockPrice);
    }
}
