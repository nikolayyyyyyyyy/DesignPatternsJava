package observer.contracts;

public interface Subject {
    void addTemperature(int temp);

    void register(Observer observer);

    void unregister(Observer observer);

    int getUpdate(Observer observer);

    void notifyObservers();
}
