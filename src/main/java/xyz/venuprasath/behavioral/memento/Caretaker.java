package xyz.venuprasath.behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(Editor editor) {
        history.push(editor.save());
    }

    public void undo(Editor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        } else {
            System.out.println("No more undos available.");
        }
    }
}
