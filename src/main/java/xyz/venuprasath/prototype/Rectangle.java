package xyz.venuprasath.prototype;

public class Rectangle extends Shape {
    private float area;
    private float length;
    private float breadth;

    public void init(float len, float breadth) {
        this.length = len;
        this.breadth = breadth;
        this.area = this.breadth * this.length;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle shape on canvas of area: " + area);
        System.out.println("Drawing a rectangle shape on canvas of length,breadth: " + length+", " + breadth);
        System.out.println("(x,y) coordinates of Square is: "+ startX + "," + startY);
        paint();
        drawBorder();
    }

    @Override
    public Shape clone() {
        Rectangle rect = new Rectangle();
        rect.length = this.length;
        rect.breadth = this.breadth;
        rect.area = this.area;
        rect.startX = this.startX;
        rect.startY = this.startY;
        rect.fillColor = this.fillColor;
        rect.borderColor = this.borderColor;
        return rect;
    }

    private void paint() {
        System.out.println("Apply fill color: "+fillColor);
    }

    private void drawBorder() {
        System.out.println("Apply border color: "+borderColor);
    }
}
