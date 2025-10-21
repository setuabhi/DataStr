package SystemDesign.ObservableDesignPattern;

public class Person implements Subscriber {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Handle the notification
    @Override
    public void update(String videoTitle) {
        System.out.println(name + " got notified about the video: " + videoTitle);
    }
}
