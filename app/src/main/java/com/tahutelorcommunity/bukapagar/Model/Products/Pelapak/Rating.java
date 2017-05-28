
package com.tahutelorcommunity.bukapagar.Model.Products.Pelapak;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("average_rate")
    @Expose
    private Integer averageRate;
    @SerializedName("user_count")
    @Expose
    private Integer userCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rating() {
    }

    /**
     * 
     * @param userCount
     * @param averageRate
     */
    public Rating(Integer averageRate, Integer userCount) {
        super();
        this.averageRate = averageRate;
        this.userCount = userCount;
    }

    public Integer getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(Integer averageRate) {
        this.averageRate = averageRate;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

}
