package xyz.venuprasath.structural.bridge;

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public String draw() {
        return "Square drawn. " + color.fill();
    }
}