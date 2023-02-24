package structural.decorator;

//baseAddOn
public class OrangeCone implements IceCream{

    //no args constructor as no previous object is needed
    public OrangeCone() {
    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone ";
    }
}
