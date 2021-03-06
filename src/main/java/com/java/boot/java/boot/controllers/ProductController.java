package com.java.boot.java.boot.controllers;

import com.java.boot.java.boot.models.Product;
import com.java.boot.java.boot.services.ProductService;
import com.java.boot.java.boot.services.interfaces.IProductService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService svc;

    @RequestMapping("")
    public ResponseEntity Get() {
        Iterable<Product> products = svc.Get();

        return ResponseEntity.ok().body(products);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public ResponseEntity Post(@RequestBody Product prod) {
        ProductService svc = new ProductService();
        svc.save(prod);

        return new ResponseEntity(null, HttpStatus.CREATED);
    }
}
