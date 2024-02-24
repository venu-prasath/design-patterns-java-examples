package xyz.venuprasath.creational.prototype;

public abstract class Shape {

    float startX;
    float startY;

    String fillColor;
    String borderColor;

    abstract void draw();

    public abstract Shape clone();
}
