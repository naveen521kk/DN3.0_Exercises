package design_patterns.ObserverPatternExample;


public interface Stock {
    void registerObserver(Observer observer);

    void deregisterObserver(Observer observer);

    void notifyObservers();
}
