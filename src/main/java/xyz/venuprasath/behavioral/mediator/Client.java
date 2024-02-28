package xyz.venuprasath.behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ConcreteUser(mediator, "John");
        User user2 = new ConcreteUser(mediator, "Doe");
        User user3 = new ConcreteUser(mediator, "Smith");
        User user4 = new ConcreteUser(mediator, "Jane");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
