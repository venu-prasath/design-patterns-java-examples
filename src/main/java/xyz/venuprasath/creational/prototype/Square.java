package xyz.venuprasath.creational.prototype;

public class Square extends Shape {

    private float length;
    private float area;

    public void init(float len) {
        this.length = len;
        this.area = this.length * this.length;
    }

    @Override
    void draw() {
        System.out.println("Drawing a square shape on canvas of length: " + length);
        System.out.println("(x,y) coordinates of Square is: "+ startX + "," + startY);
        paint();
        drawBorder();
    }

    @Override
    public Shape clone() {
        Square square = new Square();
        square.length = this.length;
        square.area = this.area;
        square.startX = this.startX;
        square.startY = this.startY;
        square.fillColor = this.fillColor;
        square.borderColor = this.borderColor;
        return square;
    }

    private void paint() {
        System.out.println("Apply fill color: "+fillColor);
    }

    private void drawBorder() {
        System.out.println("Apply border color: "+borderColor);
    }
}
