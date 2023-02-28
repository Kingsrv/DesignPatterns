package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
//Publisher
public class Amazon {

    List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    //make the publisher class singleton as we do not want multiple publisher objects because we have only one list
    private Amazon(){

    }

    private static Amazon instance;

    public static Amazon getInstance(){
        if(instance == null){
            instance =  new Amazon();
        }
        return instance;
        }

    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void unRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlacedEvent(){

        // using a facade wil not be good here
        //scmNotifier.notify();
        //sellerNotifier.notify();
        //customerNotifier.notify();
        //analyticsService.notify();
        //If we use facade then we will not be able to add/remove subscribers from runtime.

        //business logic
        for (OrderPlacedSubscriber o: orderPlacedSubscribers) {
            o.orderPlaceEvent();
        }
    }
}

/*
Publisher has 3 major things
    1. List of all the subscribers
    2. Register and Unregister method to add/remove a subscriber from the list
    3. event generation method.

Q. why is singleton class required ?

 Amazon a = new Amazon();
 a.orderPlaced();

 Amazon a1, a2, a3 etc.

 In total 10 subscriber objects
 a1 -> {3}
 a2 -> {5}
 a3 -> {2}

 a2.orderPlacedEvent();

 The above will only notify 5 subscribers related to a2
 */
