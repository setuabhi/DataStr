package SystemDesign.DesignPatterns.Structural;

public class RazorPayPaymentAdapter implements PaymentService{
RazorPayAPI razorPayAPI = new RazorPayAPI();
    @Override
    public void makePayment() {
        razorPayAPI.doRazorPayPayment();
    }
}
