package com.java.boot.java.boot.models;

public class Product {
    public String brand;
    public String model;
    public double price;
    public boolean inStock;

    public Product(String brand, String model, double price, boolean inStock) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.inStock = inStock;
    }

    public Product(){}
}
