package behavioral.strategy.pathCalculationStrategy;

public class BikePathCalculator implements PathCalculator {

    private BikePathCalculator() {
    }

    private static BikePathCalculator bikePathCalculator;

    public static BikePathCalculator getObj(){
        if(bikePathCalculator == null){
            return new BikePathCalculator();
        }
        return bikePathCalculator;
    }


    @Override
    public void findPath(String Source, String destination) {
        System.out.println("Bike se jaldi pahuch jayenge");
    }
}
