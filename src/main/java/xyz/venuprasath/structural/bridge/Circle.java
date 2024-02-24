package xyz.venuprasath.structural.bridge;

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public String draw() {
        return "Circle drawn. " + color.fill();
    }
}