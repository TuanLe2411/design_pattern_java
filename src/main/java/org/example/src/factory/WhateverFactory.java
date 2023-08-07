package org.example.src.factory;

import org.example.src.factory.product_lists.DefaultProduct;
import org.example.src.factory.product_lists.Product;
import org.example.src.factory.product_lists.WhateverProduct;

public class WhateverFactory extends Factory {
    public final String DEFAULT_PRODUCT_TYPE = "default";
    public final int DEFAULT_PRODUCT_ID = 0;
    public final int WHATEVER_PRODUCT_ID = 100;
    @Override
    protected Product createProduct(String productType) {
        Product product = null;
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
