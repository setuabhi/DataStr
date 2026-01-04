package SystemDesign.FactoryDesign;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Email notification sent");
    }
}
