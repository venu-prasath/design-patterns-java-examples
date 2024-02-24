package xyz.venuprasath.structural.proxy;

public class RealDocument implements Document {
    private String filename;

    public RealDocument(String filename) {
        this.filename = filename;
        loadFromDisk(filename); // Simulate expensive operation
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
