
package com.tahutelorcommunity.bukapagar.Model.Transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feedback {

    @SerializedName("for_seller")
    @Expose
    private ForSeller forSeller;
    @SerializedName("for_buyer")
    @Expose
    private Object forBuyer;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Feedback() {
    }

    /**
     * 
     * @param forSeller
     * @param forBuyer
     */
    public Feedback(ForSeller forSeller, Object forBuyer) {
        super();
        this.forSeller = forSeller;
        this.forBuyer = forBuyer;
    }

    public ForSeller getForSeller() {
        return forSeller;
    }

    public void setForSeller(ForSeller forSeller) {
        this.forSeller = forSeller;
    }

    public Object getForBuyer() {
        return forBuyer;
    }

    public void setForBuyer(Object forBuyer) {
        this.forBuyer = forBuyer;
    }

}
