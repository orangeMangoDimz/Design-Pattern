package model;

public class FoodPackage extends Package{
    @Override
    public void preparing() {
        System.out.println("Food is preparing");
    }

    @Override
    public void delivery() {
        System.out.println("Food is delivering");
    }

    @Override
    public void arrived() {
        System.out.println("Food is ready to serve");
    }
}
