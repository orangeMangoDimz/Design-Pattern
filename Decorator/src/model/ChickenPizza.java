package model;

public class ChickenPizza extends Pizza{
    public ChickenPizza() {
        setName("Chicken Pizza");
        setPrice(38000);
    }

    @Override
    public void cook() {
        System.out.println("CHICKEN PIZZA is cooked ...");
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
