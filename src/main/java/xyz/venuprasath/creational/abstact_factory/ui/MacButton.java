package xyz.venuprasath.creational.abstact_factory.ui;

import xyz.venuprasath.creational.abstact_factory.interfaces.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Mac button!");
    }
}
