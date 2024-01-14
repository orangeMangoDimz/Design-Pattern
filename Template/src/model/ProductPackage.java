package model;

public class ProductPackage extends Package{
    @Override
    public void preparing() {
        System.out.println("Product is preparing");
    }

    @Override
    public void delivery() {
        System.out.println("Product is delivering");
    }

    @Override
    public void arrived() {
        System.out.println("Product is ready to serve");
    }
}
