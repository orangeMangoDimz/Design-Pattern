package model;

import Strategy.PaymentStrategy;

public class User {
    private String name;

    public void pay (PaymentStrategy paymentStrategy, int amount){
        paymentStrategy.pay(amount);
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
