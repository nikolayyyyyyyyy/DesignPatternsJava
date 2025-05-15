package observer.models;

import observer.contracts.Observer;
import observer.contracts.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private final List<Observer> observers;
    private final List<Integer> temp;
    private boolean isChanged;

    public WeatherStation() {
        this.observers = new ArrayList<>();
        this.temp = new ArrayList<>();
        this.isChanged = false;
    }

    @Override
    public void addTemperature(int temp) {
        this.temp.add(temp);
        this.isChanged = true;
        this.notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public int getUpdate(Observer observer) {
        return this.temp.getLast();
    }

    @Override
    public void notifyObservers() {
        if (!this.isChanged) {
            return;
        }
        this.isChanged = false;
        for (Observer observer :
                this.observers) {
            observer.update();
        }
    }
}
