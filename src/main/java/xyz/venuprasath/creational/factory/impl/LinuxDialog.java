package xyz.venuprasath.creational.factory.impl;

import xyz.venuprasath.creational.factory.Dialog;
import xyz.venuprasath.creational.factory.LinuxButton;
import xyz.venuprasath.creational.factory.interfaces.Button;

public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
