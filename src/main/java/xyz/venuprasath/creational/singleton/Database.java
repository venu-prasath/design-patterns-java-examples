package xyz.venuprasath.creational.singleton;

public class Database {

    private String host;
    private String username;
    private String password;

    private static Database instance;

    private Database(String hostname, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
        initDb();
    }

    public static Database getInstance(String host, String username, String password) {
        if(instance == null) {
            instance = new Database(host, username, password);
        }
        return instance;
    }

    private void initDb() {
        System.out.println("Connecting to database...");
    }

    public void runQuery(String query) {
        System.out.println("Running query: \n"+query);
    }


}
