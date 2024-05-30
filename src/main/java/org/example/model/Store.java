package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products=new ProductForSale[3];
        products[0] = new Bread("Test", 10, "Test Bread", "Whole Grain");
        products[1] = new Chocolate("Test", 10, "Test Chocolate", 70);
        products[2] = new Coke("Test", 10, "Test Coke", 500);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}