package behavioral.observer;

public class CustomerNotifier implements OrderPlacedSubscriber{
    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying customer");
        System.out.println("customer notifier listener -> notifying customer ");
        return r;
    }
}
