package SystemDesign.StrategyDesinPattern.withSDP;

public class Gpay implements PaymentStrategy {
    @Override
    public void doPayment() {
        System.out.println("Doing payment using UPI");
    }
}
