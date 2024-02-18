package xyz.venuprasath.factory.impl;

import xyz.venuprasath.factory.Dialog;
import xyz.venuprasath.factory.LinuxButton;
import xyz.venuprasath.factory.interfaces.Button;

public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
