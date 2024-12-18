package Lab3.ex1;

import java.util.LinkedHashSet;
import java.util.Set;

public class User {
    private final String name;
    private final Set<String> apis;
    private double duration;

    public User(String name, double duration) {
        this.name = name;
        this.apis = new LinkedHashSet<>();
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public Set<String> getApis() {
        return apis;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void addApi(String api){
        this.apis.add(api);
    }
}
