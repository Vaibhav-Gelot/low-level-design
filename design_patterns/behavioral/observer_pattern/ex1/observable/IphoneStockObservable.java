package design_patterns.behavioral.observer_pattern.ex1.observable;

import java.util.ArrayList;
import java.util.List;

import design_patterns.behavioral.observer_pattern.ex1.observer.NotificationAlertObserver;

public class IphoneStockObservable implements StockObservable {

    List<NotificationAlertObserver> observers = new ArrayList<>();

    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer : observers) {

            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

    @Override
    public void setStockCount(int newStockAdded) {
        this.stockCount += newStockAdded;
        if (this.stockCount - newStockAdded == 0) {
            notifySubscriber();
        }

    }
}
