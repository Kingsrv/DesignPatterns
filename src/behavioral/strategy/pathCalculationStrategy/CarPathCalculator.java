package behavioral.strategy.pathCalculationStrategy;

public class CarPathCalculator implements PathCalculator {

    private CarPathCalculator() {
    }

    private static CarPathCalculator carPathCalculator;

    public static CarPathCalculator getObj(){
        if(carPathCalculator == null){
            return new CarPathCalculator();
        }
        return carPathCalculator;
    }
    @Override
    public void findPath(String Source, String destination) {
        System.out.println("chlo car se chalte hain !!");
    }
}
