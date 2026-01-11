package SystemDesign.ObservableDesignPattern;

public class Bot implements Subscriber {
    private String name;

    public Bot(String name) {
        this.name = name;
    }

    // Handle the notification
    @Override
    public void notify(String videoTitle) {
        System.out.println("Bot: "+name + " got notified about the video: " + videoTitle);
        System.out.println("Analyzing video");
    }
}