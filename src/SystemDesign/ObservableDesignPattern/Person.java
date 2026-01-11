package SystemDesign.ObservableDesignPattern;

public class Person implements Subscriber {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Handle the notification
    @Override
    public void notify(String videoTitle) {
        System.out.println("Human: "+name + " got notified about the video: " + videoTitle);
        System.out.println("Watching Video");
    }
}
