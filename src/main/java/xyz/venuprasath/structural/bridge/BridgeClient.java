package xyz.venuprasath.structural.bridge;

public class BridgeClient {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        System.out.println(redCircle.draw());
        System.out.println(blueSquare.draw());
    }
}
