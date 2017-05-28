
package com.tahutelorcommunity.bukapagar.Model.Carts.Carts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feedbacks {

    @SerializedName("positive")
    @Expose
    private Integer positive;
    @SerializedName("negative")
    @Expose
    private Integer negative;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Feedbacks() {
    }

    /**
     * 
     * @param negative
     * @param positive
     */
    public Feedbacks(Integer positive, Integer negative) {
        super();
        this.positive = positive;
        this.negative = negative;
    }

    public Integer getPositive() {
        return positive;
    }

    public void setPositive(Integer positive) {
        this.positive = positive;
    }

    public Integer getNegative() {
        return negative;
    }

    public void setNegative(Integer negative) {
        this.negative = negative;
    }

}
