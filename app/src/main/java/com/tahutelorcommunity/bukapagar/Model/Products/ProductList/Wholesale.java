
package com.tahutelorcommunity.bukapagar.Model.Products.ProductList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wholesale {

    @SerializedName("lower_bound")
    @Expose
    private Integer lowerBound;
    @SerializedName("price")
    @Expose
    private Integer price;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wholesale() {
    }

    /**
     * 
     * @param lowerBound
     * @param price
     */
    public Wholesale(Integer lowerBound, Integer price) {
        super();
        this.lowerBound = lowerBound;
        this.price = price;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
