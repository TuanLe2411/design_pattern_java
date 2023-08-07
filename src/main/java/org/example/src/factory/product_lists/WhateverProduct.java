package org.example.src.factory.product_lists;

public class WhateverProduct extends Product {
    public WhateverProduct() {
        super();
    }

    @Override
    public String create() {
        return "Whatever product";
    }
}