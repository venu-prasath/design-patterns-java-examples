package xyz.venuprasath.behavioral.memento;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();
        Caretaker caretaker = new Caretaker();

        editor.setState("State #1");
        editor.setState("State #2");
        caretaker.save(editor);
        System.out.println("Current State: " + editor.getState());

        editor.setState("State #3");
        caretaker.save(editor);
        System.out.println("Current State: " + editor.getState());

        editor.setState("State #4");
        System.out.println("Current State: " + editor.getState());

        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getState());

        caretaker.undo(editor);
        System.out.println("After another undo: " + editor.getState());
    }
}
