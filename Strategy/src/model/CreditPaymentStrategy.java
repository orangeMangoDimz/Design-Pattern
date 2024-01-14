package model;

public class CreditPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Pay with credit");
    }
}
