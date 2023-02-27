package behavioral.strategy.factory;

import behavioral.strategy.pathCalculationStrategy.BikePathCalculator;
import behavioral.strategy.pathCalculationStrategy.CarPathCalculator;
import behavioral.strategy.pathCalculationStrategy.PathCalculator;
import behavioral.strategy.pathCalculationStrategy.WalkPathCalculator;

public class TravelModeFactory {

    public static PathCalculator getModeObj(TravelMode mode){

        return switch (mode){
            case CAR -> CarPathCalculator.getObj();
            case BIKE -> BikePathCalculator.getObj();
            case WALK -> WalkPathCalculator.getObj();
        };
    }
}
