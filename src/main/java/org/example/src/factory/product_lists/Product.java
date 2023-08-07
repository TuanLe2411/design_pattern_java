package org.example.src.factory.product_lists;

import lombok.Data;

@Data
public abstract class Product {
    public abstract String create();
}
