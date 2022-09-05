package com.example.model;

public class Item {

    private String productID;
    private String productName;
    private String productCategory;
    private int quantity;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public Item(String productID, String productName, String productCategory, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
