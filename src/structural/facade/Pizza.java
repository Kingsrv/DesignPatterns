package structural.facade;

public class Pizza implements Food{

    private String preparedFood;

    @Override
    public void prepareFood(String items) {
        preparedFood = "thin crust pizza" +items;
    }

    @Override
    public String deliverFood() {
        return preparedFood;
    }
}
