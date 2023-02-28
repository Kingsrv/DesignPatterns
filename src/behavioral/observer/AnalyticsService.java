package behavioral.observer;

public class AnalyticsService implements OrderPlacedSubscriber{
    public AnalyticsService() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
       ReturnData r = new ReturnData("Consuming Analytics");
        System.out.println("Analytics subscriber -> consuming analytics");
        return r;
    }
}
