package SystemDesign.Builder;

public class NotificationWithBuilder {
    private String message;
    private String subject;
    private int priority;
    private int retryCount;

    private NotificationWithBuilder(Builder builder) {
        this.message = builder.message;
        this.subject = builder.subject;
        this.priority = builder.priority;
        this.retryCount = builder.retryCount;
    }

    public static class Builder {

        private String message;
        private String subject;
        private int priority;
        private int retryCount;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public Builder retryCount(int retryCount) {
            this.retryCount = retryCount;
            return this;
        }

        public NotificationWithBuilder build() {
            return new NotificationWithBuilder(this);
        }
    }
}
