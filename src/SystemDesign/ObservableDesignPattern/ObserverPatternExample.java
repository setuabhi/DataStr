package SystemDesign.ObservableDesignPattern;

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a YouTube channel
        YouTubeChannel channel = new YouTubeChannel("Cool Coding Channel");

        // Create human subscribers
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        // Create bot subscribers
        Bot appleBot = new Bot("AppleBot");
        Bot metaBot = new Bot("metaBot");

        // Subscribers subscribe to the channel
        channel.subscribe(alice);
        channel.subscribe(appleBot);

        // Channel uploads a new video
        channel.uploadVideo("Learn Observer Pattern in Java");

    }
}
