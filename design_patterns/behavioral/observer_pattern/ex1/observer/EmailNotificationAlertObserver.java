package design_patterns.behavioral.observer_pattern.ex1.observer;

import design_patterns.behavioral.observer_pattern.ex1.observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver {

    private String emailId;
    private StockObservable observable;

    public EmailNotificationAlertObserver(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;

    }

    @Override
    public void update() {
        sentEmail(emailId, "Produnct in stock!! hurry!! : stock -> " + observable.getStockCount());

    }

    public void sentEmail(String emailId, String msg) {
        System.out.println("Email Sent to : " + emailId + " : " + msg);

    }

}
