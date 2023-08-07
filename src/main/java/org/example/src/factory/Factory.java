package org.example.src.factory;


import org.example.src.factory.product_lists.Product;

public abstract class Factory {
    protected abstract Product createProduct(String productType);

    public Product orderProduct(String productType) {
        Product product = createProduct(productType);
        product.create();
        return product;
    }
}
