package observer.contracts;

public interface Observer {
    void update();

    void setSubject(Subject subject);
}
