package creational.factory;

import creational.factory.component.button.Button;
import creational.factory.component.button.IosButton;
import creational.factory.component.dropdown.DropDown;
import creational.factory.component.dropdown.IosDropDown;
import creational.factory.component.menu.IosMenu;
import creational.factory.component.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
