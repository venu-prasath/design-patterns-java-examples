package xyz.venuprasath.creational.abstact_factory.factories;

import xyz.venuprasath.creational.abstact_factory.interfaces.Button;
import xyz.venuprasath.creational.abstact_factory.interfaces.Checkbox;
import xyz.venuprasath.creational.abstact_factory.ui.WindowsButton;
import xyz.venuprasath.creational.abstact_factory.ui.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
