package com.company;

public class Product {
    private String productname;
    private int productprice;
    private String productdescription;

    public Product(String productname, int productprice, String productdescription) {
        this.productname = productname;
        this.productprice = productprice;
        this.productdescription = productdescription;
    }

    public int getProductprice() {
        return productprice;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public String getProductname() {
        return productname;
    }
}
