package SystemDesign.DesignPatterns.Creational.Builder;

public class client {
    public static void main(String[] args) {
        //Without Builder setup
        NotificationWithoutBuilder notificationWithoutBuilder =
                new NotificationWithoutBuilder("Hello", null, 0, 0);

        //With builder setup
        NotificationWithBuilder notificationWithBuilder =
             new NotificationWithBuilder.Builder() // Access inner static Class
                     .message("Hello") //message method set's message to "Hello" and return Builder object so that subject works
                     .subject(null)
                     .priority(0)
                     .retryCount(0)
                     .build();
    }
}
