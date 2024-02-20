package xyz.venuprasath.abstact_factory.ui;

import xyz.venuprasath.abstact_factory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Windows Button!");
    }
}
