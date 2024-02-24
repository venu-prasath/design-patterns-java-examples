package xyz.venuprasath.creational.abstact_factory.ui;

import xyz.venuprasath.creational.abstact_factory.interfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Windows Checkbox!");
    }
}
