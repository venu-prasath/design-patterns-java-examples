package xyz.venuprasath.creational.factory;

import xyz.venuprasath.creational.factory.interfaces.Button;

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
