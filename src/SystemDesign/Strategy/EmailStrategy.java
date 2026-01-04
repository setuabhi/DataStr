package SystemDesign.Strategy;

public class EmailStrategy implements NotificationStrategy{
    @Override
    public void send() {
        System.out.println("Email notification sent");
    }
}
