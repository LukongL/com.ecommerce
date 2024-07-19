package com.ecommerce;

public class Product {
    private int productID;
    private String name;
    private double price;
    private String description;
    private int stockQuantity;

    public Product(int productID, String name, double price, String description, int stockQuantity) {
        if (productID <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Product price cannot be negative.");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Product description cannot be null or empty.");
        }
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative.");
        }
        
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative.");
        }
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Product [ID=" + productID + ", Name=" + name + ", Price=" + price + 
               ", Description=" + description + ", Stock=" + stockQuantity + "]";
    }
}
