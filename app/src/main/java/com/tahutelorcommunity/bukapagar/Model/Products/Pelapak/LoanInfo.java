
package com.tahutelorcommunity.bukapagar.Model.Products.Pelapak;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanInfo {

    @SerializedName("eligible")
    @Expose
    private Boolean eligible;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("remaining")
    @Expose
    private Integer remaining;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoanInfo() {
    }

    /**
     * 
     * @param limit
     * @param remaining
     * @param eligible
     */
    public LoanInfo(Boolean eligible, Integer limit, Integer remaining) {
        super();
        this.eligible = eligible;
        this.limit = limit;
        this.remaining = remaining;
    }

    public Boolean getEligible() {
        return eligible;
    }

    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

}
