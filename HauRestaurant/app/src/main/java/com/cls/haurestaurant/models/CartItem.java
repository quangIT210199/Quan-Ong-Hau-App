package com.cls.haurestaurant.models;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CartItem implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;


    @SerializedName( "product_id")
    private Product product;

    @SerializedName("user_id")
    private User user;


    @SerializedName("bill_id")
    private Bill bill;

    @SerializedName("quantity")
    private int quantity;


    public CartItem(){ }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
