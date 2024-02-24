package xyz.venuprasath.creational.abstact_factory.factories;

import xyz.venuprasath.creational.abstact_factory.interfaces.Button;
import xyz.venuprasath.creational.abstact_factory.interfaces.Checkbox;
import xyz.venuprasath.creational.abstact_factory.ui.MacButton;
import xyz.venuprasath.creational.abstact_factory.ui.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
