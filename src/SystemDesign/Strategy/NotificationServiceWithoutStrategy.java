package SystemDesign.Strategy;

public class NotificationServiceWithoutStrategy {
    void send(String type) {

        if (type.equals("EMAIL")) {
            new EmailStrategy().send();
        }
        else if (type.equals("SMS")) {
            new SmsStrategy().send();
        }
    }
}
