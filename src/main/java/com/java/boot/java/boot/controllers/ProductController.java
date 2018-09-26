package com.java.boot.java.boot.controllers;

import com.java.boot.java.boot.models.Product;
import com.java.boot.java.boot.services.ProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @RequestMapping("")
    public Iterable<Product> Get() {
        ProductService svc = new ProductService();
        return svc.Get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public String Post(@RequestBody Product prod) {
        return "Success";
    }
}
