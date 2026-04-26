package SystemDesign.DesignPatterns.Structural;

public class Client {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();
        paymentFacade.makePayment();
    }
}
