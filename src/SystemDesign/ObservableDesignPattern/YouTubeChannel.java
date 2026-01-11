package SystemDesign.ObservableDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private final String channelName;
    private List<Subscriber> subscribers = new ArrayList<>(); // List of subscribers

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    // Add a new subscriber
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Remove a subscriber
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Notify all subscribers about a new video
    public void uploadVideo(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(videoTitle); // Notify each subscriber
        }
    }
}
