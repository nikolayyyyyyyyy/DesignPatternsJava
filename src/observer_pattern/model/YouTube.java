package observer_pattern.model;

import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class YouTube implements Subject {
    private final List<Observer> observers;
    private final List<Video> videos;
    private boolean hasChanged;

    public YouTube() {
        this.observers = new ArrayList<>();
        this.videos = new ArrayList<>();
    }

    @Override
    public void register(Observer subscriber) {
        if (!this.observers.contains(subscriber)) {
            this.observers.add(subscriber);
        }
    }

    @Override
    public void unregister(Observer subscriber) {
        this.observers.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        if (!this.hasChanged) {
            return;
        }
        this.hasChanged = false;
        for (Observer subscriber :
                this.observers) {
            subscriber.update();
        }
    }

    @Override
    public void addVideo(Video video) {
        this.videos.add(video);
        this.hasChanged = true;
        this.notifyObservers();
    }

    @Override
    public void removeVideo(Video video) {
        this.videos.remove(video);
    }

    @Override
    public Video getUpdate(Observer subscriber) {
        return this.videos.getLast();
    }
}
