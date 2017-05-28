
package com.tahutelorcommunity.bukapagar.Model.Products.ProductList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Specs {

    @SerializedName("brand")
    @Expose
    private String brand;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Specs() {
    }

    /**
     * 
     * @param brand
     */
    public Specs(String brand) {
        super();
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
