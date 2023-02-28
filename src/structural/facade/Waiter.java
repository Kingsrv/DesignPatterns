package structural.facade;

public class Waiter {

    public static String deliverFood(FoodType foodType){
        Ingredients ingredients = new Ingredients();
        switch(foodType){
            case PIZZA :
                Food pizza = new Pizza();
                String pizzaItems = ingredients.getPizzaItems();
                pizza.prepareFood(pizzaItems);
                return pizza.deliverFood();
            case LITTI_CHOKHA:
                Food littiChokha = new LittiChokha();
                String littiChokhaItems = ingredients.getLittiChokhaItems();
                littiChokha.prepareFood(littiChokhaItems);
                return littiChokha.deliverFood();
        }
        return null;
    }
}
