package xyz.venuprasath.creational.factory.impl;

import xyz.venuprasath.creational.factory.Dialog;
import xyz.venuprasath.creational.factory.WindowsButton;
import xyz.venuprasath.creational.factory.interfaces.Button;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
