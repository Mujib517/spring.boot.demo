package com.java.boot.java.boot.services;

import com.java.boot.java.boot.models.Product;
import com.java.boot.java.boot.services.interfaces.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    List<Product> products;

    public ProductService() {
        products = new ArrayList<>();

        products.add(new Product("Nokia", "1100", 200, true));
        products.add(new Product("Nokia", "2100", 300, true));
        products.add(new Product("Samsung", "1100", 300, false));
    }

    public Iterable<Product> Get() {
        return products;
    }

    public void save(Product product) {
        products.add(product);
    }
}
