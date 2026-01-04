package SystemDesign.Strategy;

public class client {
    public static void main(String[] args) {
        //Without Strategy, service knows which Class client is referring
        NotificationServiceWithoutStrategy notificationServiceWithoutStrategy = new NotificationServiceWithoutStrategy();
        notificationServiceWithoutStrategy.send("EMAIL");

        //With Strategy, service class doesn't know which Class client is referring
        NotificationServiceWithStrategy notificationServiceWithStrategy=
                new NotificationServiceWithStrategy();
        notificationServiceWithStrategy.setStrategy(new EmailStrategy());
        notificationServiceWithStrategy.sendNotification();
    }

}
