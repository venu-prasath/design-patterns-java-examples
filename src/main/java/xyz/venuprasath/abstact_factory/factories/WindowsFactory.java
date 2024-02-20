package xyz.venuprasath.abstact_factory.factories;

import xyz.venuprasath.abstact_factory.interfaces.Button;
import xyz.venuprasath.abstact_factory.interfaces.Checkbox;
import xyz.venuprasath.abstact_factory.ui.WindowsButton;
import xyz.venuprasath.abstact_factory.ui.WindowsCheckbox;

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
