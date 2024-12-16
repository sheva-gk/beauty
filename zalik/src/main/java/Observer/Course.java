package Observer;

import java.util.ArrayList;
import java.util.List;

class Course implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addNewLesson(String lesson) {
        this.message = "New lesson available: " + lesson;
        notifyObservers();
    }
}