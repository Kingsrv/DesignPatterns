package structural.facade;

public class Client {
    public static void main(String[] args) {
        System.out.println(Waiter.deliverFood(FoodType.PIZZA));
        System.out.println(Waiter.deliverFood(FoodType.LITTI_CHOKHA));
    }
}
