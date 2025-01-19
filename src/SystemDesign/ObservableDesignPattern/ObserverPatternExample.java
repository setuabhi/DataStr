package SystemDesign.ObservableDesignPattern;

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a YouTube channel
        YouTubeChannel channel = new YouTubeChannel("Cool Coding Channel");

        // Create subscribers
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        // Subscribers subscribe to the channel
        channel.subscribe(alice);
        channel.subscribe(bob);

        // Channel uploads a new video
        channel.uploadVideo("Learn Observer Pattern in Java");

        // Unsubscribe Bob and upload another video
        channel.unsubscribe(bob);
        channel.uploadVideo("Advanced Java Tutorials");
    }
}
