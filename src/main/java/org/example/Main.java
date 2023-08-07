package org.example;

import org.example.src.factory.WhateverFactory;
import org.example.src.factory.product_lists.Product;

public class Main {
    public static void main(String[] args) {
        WhateverFactory whateverFactory = new WhateverFactory();
        Product product = whateverFactory.orderProduct(whateverFactory.DEFAULT_PRODUCT_TYPE);
    }
}