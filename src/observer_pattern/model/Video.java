package observer_pattern.model;

public class Video {
    private String title;
    private String description;
    private double duration;

    public Video(String title, String description, double duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Description: %s, Duration: %.2f.", this.title, this.description, this.duration);
    }
}
