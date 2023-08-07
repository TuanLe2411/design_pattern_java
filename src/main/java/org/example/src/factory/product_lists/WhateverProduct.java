package org.example.src.factory.product_lists;

public class WhateverProduct extends Product {
    public WhateverProduct() {
        super();
    }

    @Override
    public void create() {
        System.out.println("Whatever product");
    }
}