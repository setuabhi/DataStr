package SystemDesign.StrategyDesinPattern.withSDP;

public class CreditCard implements PaymentStrategy {
    @Override
    public void doPayment() {
        System.out.println("Doing Payment Using Netbanking");
    }
}
