package SystemDesign.Builder;

public class NotificationWithoutBuilder {
    private String message;
    private String subject;
    private int priority;
    private int retryCount;

    public NotificationWithoutBuilder(
            String message,
            String subject,
            int priority,
            int retryCount
    ) {
        this.message = message;
        this.subject = subject;
        this.priority = priority;
        this.retryCount = retryCount;
    }
}
