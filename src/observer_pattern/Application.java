package observer_pattern;
import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;
import observer_pattern.model.Subscriber;
import observer_pattern.model.Video;
import observer_pattern.model.YouTube;

public class Application {
    public static void main(String[] args) {
        Observer first = new Subscriber("Nikolay");
        Observer second = new Subscriber("Ivan");
        Observer third = new Subscriber("Atanas");

        Subject subject = new YouTube();

        subject.register(first);
        subject.register(second);
        subject.register(third);

        first.setSubject(subject);
        second.setSubject(subject);
        third.setSubject(subject);

        Video firstVideo = new Video("Shumen",
                "Some description of Shumen",
                5.20);


        subject.addVideo(firstVideo);

        subject.unregister(second);
        subject.unregister(third);
        second.removeSubject();
        third.removeSubject();

        Video secondVideo = new Video("Smqdovo",
                "Some description of Smqdovo",
                3);
        subject.addVideo(secondVideo);
    }
}
