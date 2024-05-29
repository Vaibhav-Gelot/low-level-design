package design_patterns.behavioral.observer_pattern.ex1.observer;

import design_patterns.behavioral.observer_pattern.ex1.observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver {

    private String emailId;
    private StockObservable observable;

    public MobileNotificationAlertObserver(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable; // to use data
    }

    @Override
    public void update() {
        sentMsgOnMobile(emailId, "Produnct in stock!! hurry!! : stock -> " + observable.getStockCount());

    }

    public void sentMsgOnMobile(String emailId, String msg) {
        System.out.println("Mobile Msg Sent to : " + emailId + " :" + msg);

    }
}
