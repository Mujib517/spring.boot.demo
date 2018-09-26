package com.java.boot.java.boot.services;

import com.java.boot.java.boot.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public Iterable<Product> Get() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Nokia", "1100", 200, true));
        products.add(new Product("Nokia", "2100", 300, true));
        products.add(new Product("Samsung", "1100", 300, false));

        return products;
    }
}