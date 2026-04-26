package SystemDesign.DesignPatterns.Structural;

public class PaymentFacade {
    PaymentDecorator paymentDecorator = new PaymentDecorator(new RazorPayAndPaymentAdapter());

    void makePayment() {
        paymentDecorator.makePayment();
    }
}
