package xyz.venuprasath.abstact_factory.ui;

import xyz.venuprasath.abstact_factory.interfaces.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Mac button!");
    }
}
