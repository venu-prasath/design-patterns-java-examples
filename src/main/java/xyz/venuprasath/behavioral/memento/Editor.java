package xyz.venuprasath.behavioral.memento;

public class Editor {
    private String content;

    public void setState(String content) {
        this.content = content;
    }

    public String getState() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content = memento.getState();
    }
}
