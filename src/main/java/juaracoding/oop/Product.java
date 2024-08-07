package com.juaracoding.oop;

// CHALLENGEEEEEEEEEEEEEEEEEEEE OOP
public class Product {
    private String productId;
    private String productName;
    private int price;
    private String description;
    private String imageUrl;

    public Product(String productId, String productName, int price, String description, String imageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public void addToCart() {
        System.out.println(productName + " berhasil ditambahkan ke keranjangmu!.");
        System.out.println("================================");
    }

    public void detailProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Harga: Rp." + price);
        System.out.println("Deskripsi: " + description);
        System.out.println("Image URL: " + imageUrl);
    }
}
