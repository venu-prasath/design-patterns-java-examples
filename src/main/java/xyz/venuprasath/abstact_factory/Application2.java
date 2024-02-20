package xyz.venuprasath.abstact_factory;

import xyz.venuprasath.abstact_factory.factories.GUIFactory;
import xyz.venuprasath.abstact_factory.factories.MacFactory;
import xyz.venuprasath.abstact_factory.factories.WindowsFactory;
import xyz.venuprasath.abstact_factory.interfaces.Button;
import xyz.venuprasath.abstact_factory.interfaces.Checkbox;

public class Application2 {

    public static void main(String[] args) {
        GUIFactory factory;
        Button button;
        Checkbox checkbox;

        String os_platform = "mac";
        System.out.println("Abstract Factory Design Pattern Example");
        if(os_platform.equals("windows")) {
            factory = new WindowsFactory();
        } else if(os_platform.equals("mac")) {
            factory = new MacFactory();
        } else {
            System.out.println("Unsupported platform");
            return;
        }

        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}
