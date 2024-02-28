package xyz.venuprasath.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {
    private List<Observer> observers;
    private String latestIssue;

    public Newsletter() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestIssue);
        }
    }

    public void releaseNewIssue(String issue) {
        this.latestIssue = issue;
        notifyObservers();
    }
}
