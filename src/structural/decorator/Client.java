package structural.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new ChocoChips(new ChocolateScoop(new VanillaScoop(new ChocolateSyrup(new OrangeCone()))));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
