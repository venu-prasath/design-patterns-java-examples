package xyz.venuprasath.abstact_factory.factories;

import xyz.venuprasath.abstact_factory.interfaces.Button;
import xyz.venuprasath.abstact_factory.interfaces.Checkbox;

public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}