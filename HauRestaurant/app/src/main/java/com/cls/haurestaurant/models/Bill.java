package com.cls.haurestaurant.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;

    @SerializedName("bill")
    List<CartItem> cartItems = new ArrayList<>();

    @SerializedName("creadted_time")
    private String creadtedTime;

    @SerializedName("status")
    private String status;

    public Bill(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public String getCreadtedTime() {
        return creadtedTime;
    }

    public void setCreadtedTime(String creadtedTime) {
        this.creadtedTime = creadtedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
