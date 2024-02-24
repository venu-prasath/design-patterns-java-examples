package xyz.venuprasath.creational.abstact_factory.factories;

import xyz.venuprasath.creational.abstact_factory.interfaces.Button;
import xyz.venuprasath.creational.abstact_factory.interfaces.Checkbox;

public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}