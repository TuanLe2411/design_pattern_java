package org.example.src.factory.product_lists;

public class DefaultProduct extends Product {
    public DefaultProduct() {
        super();
    }

    @Override
    public String create() {
        return "Default product";
    }
}