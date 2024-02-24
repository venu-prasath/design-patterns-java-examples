package xyz.venuprasath.creational.singleton;

public class SingletonApplication {

    public static void main(String[] args) {
        System.out.println("Setting up database");

        Database dbInstance = Database.getInstance("hostname", "username", "password");

        dbInstance.runQuery("query 1");

        Controller controller = new Controller();
        controller.performAction();
    }
}
