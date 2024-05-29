package design_patterns.behavioral.observer_pattern.ex1;

import design_patterns.behavioral.observer_pattern.ex1.observable.IphoneStockObservable;
import design_patterns.behavioral.observer_pattern.ex1.observable.StockObservable;
import design_patterns.behavioral.observer_pattern.ex1.observer.EmailNotificationAlertObserver;
import design_patterns.behavioral.observer_pattern.ex1.observer.MobileNotificationAlertObserver;
import design_patterns.behavioral.observer_pattern.ex1.observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {
        StockObservable iphStockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer1 = new EmailNotificationAlertObserver("xyz1@gamil.com", iphStockObservable);

        NotificationAlertObserver observer2 = new EmailNotificationAlertObserver("xyz2@gamil.com", iphStockObservable);

        NotificationAlertObserver observer3 = new MobileNotificationAlertObserver("xyz2@gamil.com", iphStockObservable);

        iphStockObservable.add(observer1);
        iphStockObservable.add(observer2);
        iphStockObservable.add(observer3);

        iphStockObservable.setStockCount(10);

    }

}
