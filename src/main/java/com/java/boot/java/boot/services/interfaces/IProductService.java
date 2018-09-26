package com.java.boot.java.boot.services.interfaces;

import com.java.boot.java.boot.models.Product;

public interface IProductService {

    Iterable<Product> Get();

    void save(Product product);
}
