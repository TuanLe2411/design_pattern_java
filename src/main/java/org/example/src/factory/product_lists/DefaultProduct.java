package org.example.src.factory.product_lists;

public class DefaultProduct extends Product {
    public DefaultProduct() {
        super();
    }

    @Override
    public void create() {
        System.out.println("Default product");
    }
}