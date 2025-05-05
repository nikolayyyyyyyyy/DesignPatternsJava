package observer_pattern.interfaces;

public interface Observer {

    void update();

    void setSubject(Subject subject);

    void removeSubject();
}
