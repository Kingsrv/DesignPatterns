package behavioral.strategy.pathCalculationStrategy;

public class WalkPathCalculator implements PathCalculator {
    private WalkPathCalculator() {
    }

    private static WalkPathCalculator walkPathCalculator;

    public static WalkPathCalculator getObj(){
        if(walkPathCalculator == null){
            return new WalkPathCalculator();
        }
        return walkPathCalculator;
    }

    @Override
    public void findPath(String Source, String destination) {
        System.out.println("paidal yatra krne chalein !!");
    }
}
