package xyz.venuprasath.singleton;

public class Controller {


    //Usually db login info is saved in an env file and injected rather than hard-coding
    Database dbInstance = Database.getInstance("hostname", "username", "password");


    public void performAction() {
        dbInstance.runQuery("second query from same instance");
    }
}
