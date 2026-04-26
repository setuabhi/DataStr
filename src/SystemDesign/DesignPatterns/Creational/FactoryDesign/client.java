package SystemDesign.DesignPatterns.Creational.FactoryDesign;

public class client {
    public static void main(String[] args) {
        //Without Factory, client knows which Class object being Created
        Notification emailNotification = new EmailNotification();
        emailNotification.sendNotification();

        //With Factory, client doesn't know which Class object being Created
        Notification emailNotificationWithFactory = GetNotificationFactory.getNotification("EMAIL");
        emailNotificationWithFactory.sendNotification();
    }
}
