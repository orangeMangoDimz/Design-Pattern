package model;

abstract public class Pizza {
    protected int price;
    protected String name;

    abstract public void cook();
    abstract public void totalPrice();
    public void serve(){
        System.out.println("Your pizza is ready to serve!");
    }

    public abstract int getPrice();

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
