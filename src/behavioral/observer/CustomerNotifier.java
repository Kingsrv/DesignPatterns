package behavioral.observer;

public class CustomerNotifier implements OrderPlacedSubscriber, OrderCancelledSubscriber {
    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
        a.registerOrderCancelledSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying customer");
        System.out.println("customer notifier listener -> notifying customer ");
        return r;
    }

    @Override
    public ReturnData orderCancelledEvent() {
        ReturnData r = new ReturnData("Notifying customer about cancellation");
        System.out.println("customer notifier -> order cancelled ");
        return r;
    }
}
