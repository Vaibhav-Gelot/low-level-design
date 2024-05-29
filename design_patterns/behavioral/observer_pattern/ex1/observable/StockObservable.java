package design_patterns.behavioral.observer_pattern.ex1.observable;

import design_patterns.behavioral.observer_pattern.ex1.observer.NotificationAlertObserver;

/**
 * StockObservable
 */
public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscriber();

    public int getStockCount();

    public void setStockCount(int newStockAdded);
}