package behavioral.strategy;

import behavioral.strategy.factory.TravelMode;
import behavioral.strategy.factory.TravelModeFactory;

public class GoogleMaps {

   public void getFastestRoute(String source, String dest, TravelMode mode){
       TravelModeFactory.getModeObj(mode).findPath(source,dest);
   }
}
