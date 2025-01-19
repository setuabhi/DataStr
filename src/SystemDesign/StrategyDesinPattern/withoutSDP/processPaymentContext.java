package SystemDesign.StrategyDesinPattern.withoutSDP;

public class processPaymentContext {
    public void doPayment(String paymentType) {
        if (paymentType.equalsIgnoreCase("CreditCard")) {
            System.out.println("Doing Payment Using Netbanking");
        } else if (paymentType.equalsIgnoreCase("Gpay")) {
            System.out.println("Doing payment using UPI");
        } else {
            throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        }
    }

    public static void main(String[] args) {
        processPaymentContext processor = new processPaymentContext();

        processor.doPayment("CreditCard");
        processor.doPayment("Gpay");
    }
}
