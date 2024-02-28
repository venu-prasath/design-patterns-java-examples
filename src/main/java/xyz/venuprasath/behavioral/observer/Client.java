package xyz.venuprasath.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();

        Subscriber john = new Subscriber("John");
        Subscriber jane = new Subscriber("Jane");

        newsletter.registerObserver(john);
        newsletter.registerObserver(jane);

        newsletter.releaseNewIssue("Issue 1: Observer Pattern");

        newsletter.removeObserver(jane);

        newsletter.releaseNewIssue("Issue 2: More Design Patterns");
    }
}
