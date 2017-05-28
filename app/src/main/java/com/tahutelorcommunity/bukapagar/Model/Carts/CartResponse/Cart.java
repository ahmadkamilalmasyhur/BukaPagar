
package com.tahutelorcommunity.bukapagar.Model.Carts.CartResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Cart {

    @SerializedName("seller")
    @Expose
    private Seller seller;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("installment")
    @Expose
    private List<Object> installment = null;
    @SerializedName("agent_commission")
    @Expose
    private Integer agentCommission;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cart() {
    }

    /**
     * 
     * @param installment
     * @param items
     * @param agentCommission
     * @param seller
     */
    public Cart(Seller seller, List<Item> items, List<Object> installment, Integer agentCommission) {
        super();
        this.seller = seller;
        this.items = items;
        this.installment = installment;
        this.agentCommission = agentCommission;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Object> getInstallment() {
        return installment;
    }

    public void setInstallment(List<Object> installment) {
        this.installment = installment;
    }

    public Integer getAgentCommission() {
        return agentCommission;
    }

    public void setAgentCommission(Integer agentCommission) {
        this.agentCommission = agentCommission;
    }

}
