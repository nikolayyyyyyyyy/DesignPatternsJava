package observer_pattern.model;
import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

public class Subscriber implements Observer {
    private String name;
    private Subject subject;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Video video = this.subject.getUpdate(this);
        System.out.println(this.name + " received video: " + video);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void removeSubject() {
        this.subject = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }
}
