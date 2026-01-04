package SystemDesign.Builder;

public class client {
    public static void main(String[] args) {
        NotificationWithoutBuilder notificationWithoutBuilder =
                new NotificationWithoutBuilder("Hello", null, 0, 0);

        NotificationWithBuilder notificationWithBuilder =
             new NotificationWithBuilder.Builder() // Access inner static Class
                     .message("Hello") //message method set's message to "Hello" and return Builder object so that subject works
                     .subject(null)
                     .priority(0)
                     .retryCount(0)
                     .build();
    }
}
