package observer_pattern.interfaces;

import observer_pattern.model.Video;

public interface Subject {

    void register(Observer subscriber);

    void unregister(Observer subscriber);

    void notifyObservers();

    void addVideo(Video video);

    void removeVideo(Video video);

    Video getUpdate(Observer subscriber);
}
