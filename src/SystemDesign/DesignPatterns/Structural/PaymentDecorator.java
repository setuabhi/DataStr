package SystemDesign.DesignPatterns.Structural;

public class PaymentDecorator implements PaymentService{
    PaymentService paymentService;
    PaymentDecorator (PaymentService paymentService)
    {
        this.paymentService=paymentService;
    }
    @Override
    public void makePayment() {
        System.out.println("Added decorations like beautiful logging");
        paymentService.makePayment();
    }
}
