package SystemDesign.DesignPatterns.Structural;

public class RazorPayAndPaymentAdapter implements PaymentService{
RazorPayAPI razorPayAPI = new RazorPayAPI();
    @Override
    public void makePayment() {
        razorPayAPI.doRazorPayPayment();
    }
}
