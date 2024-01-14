package main;

import Strategy.CreditPaymentStrategy;
import Strategy.PaymentStrategy;
import model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Dimas");
        user.pay(new CreditPaymentStrategy(), 200000);
    }
}
