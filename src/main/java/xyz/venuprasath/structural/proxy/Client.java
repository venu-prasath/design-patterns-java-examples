package xyz.venuprasath.structural.proxy;

public class Client {

    public static void main(String[] args) {
        Document document = new DocumentProxy("test.pdf");
        document.display();
        document.display();
    }
}
