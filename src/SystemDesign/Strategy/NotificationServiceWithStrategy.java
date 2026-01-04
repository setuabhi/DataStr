package SystemDesign.Strategy;

public class NotificationServiceWithStrategy {
    private NotificationStrategy strategy;

    // someone tells HOW to send
    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendNotification() {
        strategy.send();
    }
}
