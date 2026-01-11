package SystemDesign.FactoryDesign;

public class GetNotificationFactory {
    public static Notification getNotification(String type) {

        if ("EMAIL".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } else if ("SMS".equalsIgnoreCase(type)) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Invalid type");
    }
}
