
package com.tahutelorcommunity.bukapagar.Model.Invoices.ResponseInvoice;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transaction_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("transaction_id")
    @Expose
    private String transactionId;
    @SerializedName("seller")
    @Expose
    private Seller seller;
    @SerializedName("total_amount")
    @Expose
    private Integer totalAmount;
    @SerializedName("agent_commission_amount")
    @Expose
    private Integer agentCommissionAmount;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("phone_credit")
    @Expose
    private Object phoneCredit;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transaction_() {
    }

    /**
     * 
     * @param id
     * @param transactionId
     * @param state
     * @param totalAmount
     * @param phoneCredit
     * @param products
     * @param agentCommissionAmount
     * @param seller
     */
    public Transaction_(Integer id, String transactionId, Seller seller, Integer totalAmount, Integer agentCommissionAmount, String state, Object phoneCredit, List<Product> products) {
        super();
        this.id = id;
        this.transactionId = transactionId;
        this.seller = seller;
        this.totalAmount = totalAmount;
        this.agentCommissionAmount = agentCommissionAmount;
        this.state = state;
        this.phoneCredit = phoneCredit;
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getAgentCommissionAmount() {
        return agentCommissionAmount;
    }

    public void setAgentCommissionAmount(Integer agentCommissionAmount) {
        this.agentCommissionAmount = agentCommissionAmount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getPhoneCredit() {
        return phoneCredit;
    }

    public void setPhoneCredit(Object phoneCredit) {
        this.phoneCredit = phoneCredit;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
