package xyz.venuprasath.factory.impl;

import xyz.venuprasath.factory.Dialog;
import xyz.venuprasath.factory.WindowsButton;
import xyz.venuprasath.factory.interfaces.Button;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
