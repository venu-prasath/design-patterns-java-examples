package xyz.venuprasath.factory;

import xyz.venuprasath.factory.interfaces.Button;

public abstract class Dialog {

    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();
    }

    public abstract Button createButton();
}
