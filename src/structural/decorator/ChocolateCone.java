package structural.decorator;

//baseAddOn and also topping
public class ChocolateCone implements IceCream{

    private IceCream iceCream;

    //when chocolate cone is a base
    public ChocolateCone() {
    }

    //when chocolate cone is a topping
    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return 20;
        }else{
            return iceCream.getCost() + 20;
        }
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Chocolate Cone";
        }else{
            return iceCream.getDescription() + "Chocolate Cone ";
        }
    }
}
