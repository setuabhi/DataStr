package SystemDesign.DesignPatterns.Structural;

public class PaymentFacade {
    PaymentDecorator paymentDecorator = new PaymentDecorator(new RazorPayPaymentAdapter());

    void makePayment() {
        paymentDecorator.makePayment();
    }
}
