package xyz.venuprasath.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
