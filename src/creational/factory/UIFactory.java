package creational.factory;

import creational.factory.component.button.Button;
import creational.factory.component.dropdown.DropDown;
import creational.factory.component.menu.Menu;

public interface UIFactory {

    Button createButton();
    Menu createMenu();
    DropDown createDropDown();

}
