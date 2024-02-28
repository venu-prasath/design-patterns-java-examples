package xyz.venuprasath.behavioral.memento;

public class EditorMemento {
    private String state;

    public EditorMemento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}