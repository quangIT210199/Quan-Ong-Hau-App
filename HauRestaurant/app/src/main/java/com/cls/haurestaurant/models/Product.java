package com.cls.haurestaurant.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Product implements Serializable{

    private static final long serialVersionUID = 1L;


    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName( "description")
    private String description;

    @SerializedName("in_stock")
    private int inStock;

    @SerializedName("created_time")
    private String createdTime;

    @SerializedName("updated_time")
    private String updatedTime;

    private boolean enabled;

    @SerializedName("price")
    private float price;

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
