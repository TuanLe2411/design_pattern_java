package org.example.src.factory;

import org.example.src.factory.product_lists.DefaultProduct;
import org.example.src.factory.product_lists.Product;
import org.example.src.factory.product_lists.WhateverProduct;

public class WhateverFactory extends Factory {
    public final String DEFAULT_PRODUCT_TYPE = "default";

    @Override
    protected Product createProduct(String productType) {
        Product product;
        switch (productType) {
            case DEFAULT_PRODUCT_TYPE:
                product = new DefaultProduct();
                break;
            default:
                product = new WhateverProduct();
                break;
        }
        return product;
    }
}
