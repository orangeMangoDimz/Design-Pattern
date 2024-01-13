package model;

public class BeefPizza extends Pizza{
    public BeefPizza() {
        setName("Beef Pizza");
        setPrice(40000);
    }

    @Override
    public void cook() {
        System.out.println("BEEF PIZZA is cooked ...");
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
