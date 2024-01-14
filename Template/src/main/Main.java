package main;

import model.FoodPackage;
import model.Package;
import model.ProductPackage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Product");
        Package product = new ProductPackage();
        product.preparing();
        product.delivery();
        product.arrived();

        System.out.println("\nFood");
        Package food = new FoodPackage();
        food.preparing();
        food.delivery();
        food.arrived();
    }
}
