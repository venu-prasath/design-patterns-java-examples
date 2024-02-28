package xyz.venuprasath.behavioral.observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received a new issue of the newsletter: " + message);
    }
}
