package SystemDesign.DesignPatterns.Creational.FactoryDesign;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent");
    }
}
