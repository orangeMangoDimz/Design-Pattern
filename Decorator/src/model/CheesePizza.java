package model;

public class CheesePizza extends Pizza{
    public CheesePizza() {
        setName("Cheese Pizza");
        setPrice(32000);
    }

    @Override
    public void cook() {
        System.out.println("CHEESE PIZZA is cooked ...");
    }

    @Override
    public void totalPrice() {
        System.out.println("Total price : Rp " + price);
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
