package main;

import model.CreditPaymentStrategy;
import model.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy payment = new CreditPaymentStrategy();
        payment.pay(20000);
    }
}
