package com.cls.haurestaurant.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ProductDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("value")
    private String value;



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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
