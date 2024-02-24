package xyz.venuprasath.creational.factory;

import xyz.venuprasath.creational.factory.interfaces.Button;

public abstract class Dialog {

    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();
    }

    public abstract Button createButton();
}
