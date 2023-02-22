package creational.factory;

import creational.factory.component.button.AndroidButton;
import creational.factory.component.button.Button;
import creational.factory.component.dropdown.AndroidDropDown;
import creational.factory.component.dropdown.DropDown;
import creational.factory.component.menu.AndroidMenu;
import creational.factory.component.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
