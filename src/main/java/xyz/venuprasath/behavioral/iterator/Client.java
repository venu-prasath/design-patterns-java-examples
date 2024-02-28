package xyz.venuprasath.behavioral.iterator;

public class Client {

    public static void main(String[] args) {
        CustomCollection collection = new CustomCollection(5);
        collection.add("Java");
        collection.add("Python");
        collection.add("C++");
        collection.add("JavaScript");
        collection.add("Go");

        for (String item : collection) {
            System.out.println(item);
        }
    }
}
