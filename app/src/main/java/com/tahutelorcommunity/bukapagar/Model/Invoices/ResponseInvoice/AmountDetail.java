
package com.tahutelorcommunity.bukapagar.Model.Invoices.ResponseInvoice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AmountDetail {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("amount")
    @Expose
    private Integer amount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AmountDetail() {
    }

    /**
     * 
     * @param amount
     * @param name
     */
    public AmountDetail(String name, Integer amount) {
        super();
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
