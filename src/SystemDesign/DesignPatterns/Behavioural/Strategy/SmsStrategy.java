package SystemDesign.DesignPatterns.Behavioural.Strategy;

public class SmsStrategy implements NotificationStrategy{
    @Override
    public void send() {
        System.out.println("Sms notification sent");
    }
}
