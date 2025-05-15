package observer.models;

import observer.contracts.Observer;
import observer.contracts.Subject;

public class User implements Observer {
    private final String firstName;
    private final String lastName;
    private final String email;
    private Subject subject;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public void update() {
        int temp = this.subject.getUpdate(this);
        System.out.printf("New update, the temperature is %d" + "\n", temp);
    }

    @Override
    public void setSubject(Subject subject) {
        if (this.subject != null) {
            throw new IllegalArgumentException("User already follow subject");
        }
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("User: %s, %s ; Email: %s",
                this.firstName,
                this.lastName,
                this.email);
    }
}
