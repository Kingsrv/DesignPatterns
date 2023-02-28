package structural.facade;

public class LittiChokha implements Food{

    private String preparedItem;

    @Override
    public void prepareFood(String items) {
        preparedItem = "baigan bharta" +items;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
