package SystemDesign.DesignPatterns.Creational.FactoryDesign;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Email notification sent");
    }
}
