package creational.factory;

import creational.factory.component.button.Button;
import creational.factory.component.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.WINDOWS);
        UIFactory factory = flutter.createUIFactory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();

        Math.sqrt(19);
    }
}
