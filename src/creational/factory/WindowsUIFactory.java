package creational.factory;

import creational.factory.component.button.Button;
import creational.factory.component.button.WindowsButton;
import creational.factory.component.dropdown.DropDown;
import creational.factory.component.dropdown.WindowsDropDown;
import creational.factory.component.menu.Menu;
import creational.factory.component.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
