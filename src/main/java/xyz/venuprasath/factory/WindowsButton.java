package xyz.venuprasath.factory;

import xyz.venuprasath.factory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button is rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button is clicked");
    }
}
