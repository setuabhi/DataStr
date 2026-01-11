package SystemDesign.FactoryDesign;

public class client {
    public static void main(String[] args) {
        //Without Factory, client knows which Class object being Created
        Notification emailNotification = new EmailNotification();
        emailNotification.sendNotification();

        //With Factory, client doesn't know which Class object being Created
        Notification emailNotificationwithFactory = GetNotificationFactory.getNotification("EMAIL");
        emailNotificationwithFactory.sendNotification();
    }
}
