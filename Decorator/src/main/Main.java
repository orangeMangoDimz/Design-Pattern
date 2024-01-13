package main;

import decorator.Beef;
import model.CheesePizza;
import model.ChickenPizza;
import model.Pizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pizza 1");
        Pizza pizza1 = new Beef( new CheesePizza() );
        pizza1.cook();
        pizza1.totalPrice();
        pizza1.serve();

        System.out.println("\nPizza 2");
        Pizza pizza2 = new CheesePizza();
        pizza2.cook();
        pizza2.totalPrice();
        pizza2.serve();

        System.out.println("\nPizza 3");
        Pizza pizza3 = new Beef( new ChickenPizza() );
        pizza3.cook();
        pizza3.totalPrice();
        pizza3.serve();

    }
}
