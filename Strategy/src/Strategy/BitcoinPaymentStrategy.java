package Strategy;

public class BitcoinPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Pay with bitcoin");
    }
}
