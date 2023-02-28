package behavioral.observer;

public class SellerNotifier implements OrderPlacedSubscriber{
    public SellerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying seller");
        System.out.println("seller notifier listener -> notifying seller ");
        return r;
    }
}
