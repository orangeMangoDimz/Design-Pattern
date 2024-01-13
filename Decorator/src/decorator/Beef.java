package decorator;

import model.Pizza;

public class Beef extends Decorator{
    protected Pizza pizza;
    protected int additionalPrice = 8000;
    public Beef(Pizza pizza){
        this.topping = "Beef";
        this.pizza = pizza;
    }
    @Override
    public void cook() {
        pizza.cook();
        System.out.println("New topping : " + topping);
    }

    @Override
    public void totalPrice() {
        System.out.println("Total price with topping: Rp " + (pizza.getPrice() + additionalPrice));
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + additionalPrice;
    }
}
