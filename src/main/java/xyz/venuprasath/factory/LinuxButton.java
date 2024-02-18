package xyz.venuprasath.factory;

import xyz.venuprasath.factory.interfaces.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Linux button is rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Linux button is clicked");
    }
}
