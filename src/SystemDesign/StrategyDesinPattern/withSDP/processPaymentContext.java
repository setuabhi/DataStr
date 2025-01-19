package SystemDesign.StrategyDesinPattern.withSDP;

public class processPaymentContext {
    private PaymentStrategy paymentStrategy;

    processPaymentContext(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }
    public void doPayment() {
    paymentStrategy.doPayment();
    }

    public static void main(String[] args) {
        processPaymentContext processor = new processPaymentContext(new CreditCard());
        processor.doPayment();
        processor = new processPaymentContext(new Gpay());
        processor.doPayment();
    }
}
