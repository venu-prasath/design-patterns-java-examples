package xyz.venuprasath.creational.prototype;

public class PrototypeApp {

    public static void main(String[] args) {
        Square square = new Square();
        square.startX = 0f;
        square.startY = 0f;
        square.fillColor = "transparent";
        square.borderColor = "gray";
        square.init(5);
        square.draw();

        Rectangle rect = new Rectangle();
        rect.startX = 0f;
        rect.startY = 0f;
        rect.fillColor = "transparent";
        rect.borderColor = "gray";
        rect.init(5, 10);
        rect.draw();

        Shape rect2 = rect.clone();
        rect2.draw();
    }
}
